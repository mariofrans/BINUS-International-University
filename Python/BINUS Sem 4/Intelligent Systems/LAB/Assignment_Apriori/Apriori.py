import pandas as pd
from apyori import apriori

# read the csv data
data = pd.read_csv("mid-exam.csv", header=None)

items = []

for i in range(len(data)):
    items.append([str(data.values[i, j]) for j in range(len(data.columns))])

# association rules
# aRules = apriori(items, min_support=0.01, min_confidence=0.05, min_lift=2.8, max_length=2)
aRules = apriori(items)
results = list(aRules)

# display results
# for items in results:
#     print(items)

for items in results:
    print(items)