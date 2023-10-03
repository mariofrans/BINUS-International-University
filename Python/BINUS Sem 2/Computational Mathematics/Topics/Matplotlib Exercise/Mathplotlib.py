import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np

plt.ioff()

# fig = plt.figure()
# ax = plt.axes()
# fig.suptitle('Figure with axes')

x = np.linspace(0, 10, 1000)

fig, ax = plt.subplots(2)
fig.suptitle('Sine and Cosine Functions')

ax[0].plot(x, np.sin(x))
ax[1].plot(x, np.cos(x))



plt.show()