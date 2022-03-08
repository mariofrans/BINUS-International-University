import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from matplotlib import gridspec

from sklearn.svm import SVC
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score

from scipy.stats import binom

# remove pandas warnings
pd.set_option('mode.chained_assignment', None)


""" 1a """

# dataset file path
path_insurance_data = 'BINUS Sem 5/Data Science/ME/data/train.csv'
# read dataset in pandas dataframe format
df = pd.read_csv(path_insurance_data)
# print(df)
# summary of missing values for each column
# print(df.isnull().sum())


""" 1b """

# find rows with missing values only
rows_missing_values = df.isnull().any(axis=1)
# filter df to rows with missing values only
df_missing_values = df[rows_missing_values]
# first 10 rows of df with missing values
# print(df_missing_values.head(10))
# total number of missing values in the dataset
# print("Total Data Entries with Missing Values:", len(df_missing_values))


""" 1c """

# list of ids
list_ids = [12, 14, 17, 130, 234, 466]
# filter df of missing values to only id that are in the list of ids
df_missing_values_list_ids = df[df['id'].isin(list_ids)]

# print('BEFORE:')
# print(df_missing_values_list_ids)

# find the mode for each column in dataset
df_mode = df.mode().dropna()
# inpute missing values with the mode for each respective columns
for col in df.columns: df[col] = df[col].fillna(df_mode[col][0])

# filter df of missing values to only id that are in the list of ids
df_missing_values_list_ids = df[df['id'].isin(list_ids)]

# print('AFTER:')
# print(df_missing_values_list_ids)


""" 1d """

# categorical columns
categorical_columns = [ 'Gender', 'Driving_License', 'Region_Code', 'Previously_Insured', 
                        'Vehicle_Damage', 'Policy_Sales_Channel', 'Response']

# 'Driving_License', 'Region_Code', 'Previously_Insured', 'Policy_Sales_Channel', and 'Response' 
#  columns doesn't have to be encoded as their values are already numeric
# the rest of the columns are non-categorical

# categorical column that needs to be encoded
categorical_encode = ['Gender', 'Vehicle_Damage', 'Vehicle_Age']
# encode each categorical column
for category in categorical_encode: df[category] = df[category].astype('category').cat.codes
# remove all rows that have 'Male' (anomaly) in it
for col in df.columns: df = df[df[col] != 'Male']
# convert all columns in dataframe into float (numeric) datatype
for col in df.columns: df[col] = df[col].astype(float)

# display results
# print(df)


""" 2 """

# set figure & subplots configurations
plt.figure(figsize=(10, 10))
gs = gridspec.GridSpec(3, 1)
ax = [plt.subplot(gs[i]) for i in range(3)]
explode = (0, 0)

# number of males & females with driving lisences
# Gender: 1 = Male, 0 = Female
# Driving License: 1 = Yes, 0 = No
df_males = df.loc[df['Gender']==1]
df_females = df.loc[df['Gender']==0]

# GRAPH 1: Total number of Males & Females in the dataset
total_males = len(df_males)
total_females = len(df_females)
total = total_males + total_females

ax1_sizes = [total_males/total, total_females/total]
ax1_labels = ['Males', 'Females']
ax[0].pie(ax1_sizes, labels=ax1_labels, explode=explode, autopct='%1.1f%%', startangle=90, normalize=False)
ax[0].axis('equal')

# GRAPH 2: Total number of Females with & without Vehicle Damage
females_vehicle_damage = len(df_females.loc[df_females['Vehicle_Damage']==1])
females_no_vehicle_damage = len(df_females.loc[df_females['Vehicle_Damage']==0])

ax2_sizes = [females_vehicle_damage/total_females, females_no_vehicle_damage/total_females]
ax2_labels = ['Female with Vehicle Damage', 'Female with No Vehicle Damage']
ax[1].pie(ax2_sizes, labels=ax2_labels, explode=explode, autopct='%1.1f%%', startangle=90, normalize=False)
ax[1].axis('equal')

# GRAPH 2: Total number of Males with & without Vehicle Damage
males_vehicle_damage = len(df_males.loc[df_males['Vehicle_Damage']==1])
males_no_vehicle_damage = len(df_males.loc[df_males['Vehicle_Damage']==0])

ax3_sizes = [males_vehicle_damage/total_males, males_no_vehicle_damage/total_males]
ax3_labels = ['Male with Vehicle Damage', 'Male with No Vehicle Damage']
ax[2].pie(ax3_sizes, labels=ax3_labels, explode=explode, autopct='%1.1f%%', startangle=90, normalize=False)
ax[2].axis('equal')

# save plotted chart
plt.tight_layout()
path_graph = 'BINUS Sem 5/Data Science/ME/graph.jpeg'
plt.savefig(path_graph)


""" 3a """

# label/class:
target = 'Response'
# predictors/features:
features = ['Gender', 'Age', 'Driving_License', 'Previously_Insured', 'Vehicle_Age', 
            'Vehicle_Damage', 'Annual_Premium', 'Vintage']

# save features & target data into their respective variables
X = df[features]
y = df[target]


""" 3b """

# split data using train test split
X_train, X_test, y_train, y_test = train_test_split(X, y, train_size=0.7, random_state=3316)

# using Support Vector Classifier from Scikit-Learn API
model = SVC(kernel='linear')
# fit the model
model.fit(X_train, y_train)


""" 3c """

# predict target value of training data
y_train_prediction = model.predict(X_train)
# compute & display the accuracy for the train predictions
train_accuracy = accuracy_score(y_pred=y_train_prediction, y_true=y_train)
print('Train Accuracy:', round(train_accuracy*100, 2), '%')


""" 3d """

# predict target value of test data
y_test_prediction = model.predict(X_test)
# compute & display the accuracy for the test predictions
test_accuracy = accuracy_score(y_pred=y_test_prediction, y_true=y_test)
print('Test Accuracy:', round(test_accuracy*100, 2), '%')


""" 4a """

# compute the probability of more than 4
probability_more_than_4 = 0
for i in range(4, 20, 1): probability_more_than_4 += binom.pmf(i, 20, 0.3)
print('Probability:', probability_more_than_4*100, '%')


