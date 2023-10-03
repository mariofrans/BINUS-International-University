import pandas as pd

df = pd.read_csv("automobile.csv")
print(df)

df.fillna(0, inplace = True)

max = df.Price.Idxmax()

