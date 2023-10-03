import pandas as pd
from apyori import apriori

# read data and print the data
data = pd.read_csv("store-apriori.csv", header=None)
# print(data)

shape = data.shape
# print(shape)

num_data = len(data)
# print(num_data)

# print first 5 data
# print(data.head())

# convert into a data in the form of list
# based on shape, there are 7501 data and 20 kind of different variables
records = []
for row in range(data.shape[0]):
    records.append([str(data.values[row,column]) for column in range(data.shape[1])])

# print(records[0])
# print(records[1])
# print(records[2])

association_rules = apriori(records, min_support=0.01, min_confidence=0.05, min_lift=2.8, max_length=2)
association_rules = list(association_rules)

# total item set
print("Total item set:",len(association_rules))

for item_set in association_rules:
    print()
    print(item_set)




