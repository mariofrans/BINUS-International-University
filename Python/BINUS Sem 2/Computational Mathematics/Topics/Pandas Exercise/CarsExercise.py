import pandas as pd
import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np

df = pd.read_csv("automobile.csv")

# print(df)

x = df.groupby('company')[['index']].count()

# print(x)

x.plot.bar()
plt.show()

