import numpy as np  # linear algebra
import pandas as pd  # data processing
import plotly.express as px
import apyori
from apyori import apriori

store_data = pd.read_csv('store-apriori.csv', header=None)
items = []
for i in range(0, len(store_data)):
    items.append([str(store_data.values[i, j]) for j in range(0, len(store_data.columns))])

rules = apriori(items, min_support=0.01, min_confidence=0.05, min_lift=2.8, max_length=2, target="rules")
association_results = list(rules)

for item in association_results:
    pair = item[0]
    items = [x for x in pair]

    print("Rule : ", items[0], " -> " + items[1])
    print("Support : ", str(item[1]))
    print("Confidence : ", str(item[2][0][2]))
    print("Lift : ", str(item[2][0][3]))

    print("=============================")