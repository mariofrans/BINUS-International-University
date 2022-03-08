import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

from sklearn.svm import SVC
from sklearn.neighbors import KNeighborsClassifier
from sklearn.naive_bayes import GaussianNB
from sklearn.tree import DecisionTreeClassifier
from sklearn.neural_network import MLPClassifier

from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score

from sklearn.metrics import confusion_matrix, ConfusionMatrixDisplay
from sklearn.metrics import classification_report
from sklearn.metrics import roc_curve, auc, RocCurveDisplay


####################################################################################################################

""" DATASET PATHS """

# path to dataset
path_data = 'BINUS Sem 5/Data Science/Week8_Assignment/data/train.csv'
path_data_preprocessed = 'BINUS Sem 5/Data Science/Week8_Assignment/data/train_preprocessed.csv'

# path to save results
path_results_train_test_evaluation = 'BINUS Sem 5/Data Science/Week8_Assignment/results/train_test_evaluation.csv'
path_results_classification_report = 'BINUS Sem 5/Data Science/Week8_Assignment/results/classification_report'
path_results_confusion_matrix = 'BINUS Sem 5/Data Science/Week8_Assignment/results/confusion_matrix'
path_results_roc_curve = 'BINUS Sem 5/Data Science/Week8_Assignment/results/roc_curve'

####################################################################################################################

""" PREPROCESS DATASET """

def preprocess_data():

    # read dataset file
    df = pd.read_csv(path_data, index_col='id')
    # drop all missing values
    df = df.dropna()

    # categorical column that needs to be encoded
    categorical_encode = ['Gender', 'Vehicle_Damage', 'Vehicle_Age']
    # encode each categorical column
    for category in categorical_encode: df[category] = df[category].astype('category').cat.codes

    # remove all rows that have 'Male' (anomaly) in it
    for col in df.columns: df = df[df[col] != 'Male']
    # convert all columns in dataframe into float (numeric) datatype
    for col in df.columns: df[col] = df[col].astype(float)

    # save preprocessed data to csv file
    df.to_csv(path_data_preprocessed)

# preprocess_data()

####################################################################################################################

""" READ, CONFIGURE, & SPLIT PREPROCESSED DATASETS """

# read preprocessed dataset file
df_preprocessed = pd.read_csv(path_data_preprocessed, index_col='id')

# select target column
target = 'Response'
# select columns that will not be included
unused_columns = ['Region_Code', 'Policy_Sales_Channel']
# select features columns; remove target & unused columns
features = list(df_preprocessed.columns)
features.remove(target)
for i in unused_columns: features.remove(i)

# filter df_preprocessed dataset to both features(X) and target(y) columns
X, y = df_preprocessed[features], df_preprocessed[target]

# split the whole dataset into train and test
X_train, X_test, y_train, y_test = train_test_split(X, y, train_size=0.7)

####################################################################################################################

""" TRAIN MACHINE LEARNING MODELS & CREATE PREDICTIONS FOR EACH MODEL BASED ON DATASET """

# collection of machine learning classes (models) to be used
models = {  'Support Vector Classifier': SVC(kernel='linear'), 
            'K-Nearest Neighbor': KNeighborsClassifier(), 
            'Gaussian Naive Bayes': GaussianNB(), 
            'Decision Tree Classifier': DecisionTreeClassifier(), 
            'MLP Classifier (Neural Network)': MLPClassifier(random_state=1, max_iter=300)
        }

list_models, list_train_accuracies, list_test_accuracies = [], [], []
list_confusion_matrix, list_classification_report = [], []

# create validation for each model
for key in list(models.keys()):

    model = models[key]
    model.fit(X_train, y_train)

    # predict target value for both train & test data
    y_train_prediction = model.predict(X_train)
    y_test_prediction = model.predict(X_test)

    # compute & display the accuracy for both train & test predictions
    train_accuracy = round(accuracy_score(y_pred=y_train_prediction, y_true=y_train) * 100, 2)
    test_accuracy = round(accuracy_score(y_pred=y_test_prediction, y_true=y_test)*100, 2)

    # save data to their respective lists
    list_models.append(key)
    list_train_accuracies.append(train_accuracy)
    list_test_accuracies.append(test_accuracy)

    # create & save classification report
    cr = classification_report(y_test, y_test_prediction, output_dict=True)
    df_classification_report = pd.DataFrame(cr).transpose()
    # print(df_classification_report)
    df_classification_report.to_csv(f'{path_results_classification_report}/{key}.csv')

    # create & save confution matrix
    cm = confusion_matrix(y_test, y_test_prediction, labels=model.classes_)
    display = ConfusionMatrixDisplay(confusion_matrix=cm, display_labels=model.classes_)
    display.plot()
    plt.savefig(f'{path_results_confusion_matrix}/{key}.jpeg')

    # create & save roc curve
    fpr, tpr, thresholds = roc_curve(y_test, y_test_prediction)
    roc_auc = auc(fpr, tpr)
    display = RocCurveDisplay(fpr=fpr, tpr=tpr, roc_auc=roc_auc, estimator_name='example estimator')
    display.plot()
    plt.savefig(f'{path_results_roc_curve}/{key}.jpeg')


####################################################################################################################

""" EVALUATE TRAINING & TESTING PREDICTION RESULTS """

# display & save all evaluation data in csv
df_summary = pd.DataFrame()
df_summary['Model'] = list_models
df_summary['Train Accuracy'] = list_train_accuracies
df_summary['Test Accuracy'] = list_test_accuracies
df_summary = df_summary.set_index('Model')

print("========================================================")
print('Results Summary:')
print(df_summary)
print("========================================================")

df_summary.to_csv(path_results_train_test_evaluation)

####################################################################################################################