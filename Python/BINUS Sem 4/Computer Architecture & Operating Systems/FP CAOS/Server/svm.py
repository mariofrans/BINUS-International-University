import joblib
from sklearn.metrics import classification_report
from sklearn import svm
import nltk
import csv
from nltk_utils import bag_of_words, tokenize, stem
from prep import getTestData, getPrepResponse
from joblib import dump, load
from output import handler
import pycountry

# All unique tokens [token, token, token]
all_words = []

# Unique tags [tag, tag, ...]
tags = []

# Target: [(['hello'], 'greetings'), (['hey'], 'greetings'), (['hi'], 'greetings'), (['greetings'], 'greetings'),
# Which is [([token, token, ...], tag)]
xy = []

# Get the data
X_train, y_train, all_words, tags, xy = getTestData()
# print(X_train)
# print(y_train)
# svm model
svm_model = svm.SVC(kernel='linear').fit(X_train, y_train)
# print(svm_model)
filename = "svm.joblib"
def saveModel():
    with open (filename, 'wb') as file:
        dump(svm_model, file)
def svm(utterance):
    X = getPrepResponse(utterance, all_words)
    with open(filename, 'rb') as file:
        model = load(file)
    return tags[model.predict(X)[0]]

def getOutput(tags, utterance):
    countryList = []
    # GET COUNTRY FIRST AND ADD IT TO ARRAY
    for country in pycountry.countries:
        if country.name in utterance:
            countryList.append(country.name)
        elif country.alpha_3 in utterance:
            countryList.append(country.alpha_3)

    # THEN RETURN
    return handler(tags, countryList)

# print(svm("How many case in Indo?"))