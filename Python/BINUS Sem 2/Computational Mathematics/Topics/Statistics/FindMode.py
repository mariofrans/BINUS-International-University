from scipy import stats
import numpy as np

a = np.array([[6, 1], [3, 1], [3, 1]])
x = stats.mode(a)
print(x)