import scipy as sp
import numpy as np
import matplotlib.pyplot as plt
from scipy import stats

plt.ioff()
x = stats.uniform(447, 521-447)

# 1a
print(x.mean())
print(x.std())

# 1b
prob = x.cdf(500)-x.cdf(480)
print(prob)

# 1c
x_samples = x.rvs(2000)
plt.hist(x_samples, density=1, bins=50)
plt.plot(x_samples, x.pdf(x_samples), lw=5)
plt.show()