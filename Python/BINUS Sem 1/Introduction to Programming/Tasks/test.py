# import scipy
# import numpy as np
# import scipy.stats as stats
#
# data1 = scipy.rand(100)  # generate 100 random number
#
# print(scipy.median(data1))
# print(stats.describe(data1))
# print(stats.skew(data1))

import pandas as pd

df = pd.DataFrame({"Population": [909976, 8615246, 2872086, 2273305], "State": ["Sweden", "United Kingdom", "Italy", "France"]}, index=["Stockholm", "London", "Rome", "Paris"])

print(df)

print(df.loc[df.Population>1000000])

