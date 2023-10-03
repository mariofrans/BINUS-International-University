import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

V = np.array([0.6, 0.7, 0.8, 0.9, 1.0, 1.1]).reshape(-1, 1)
I = np.array([0.01, 0.05, 0.20, 0.70, 2.00, 4.00])

model = LinearRegression()
model.fit(V, I)

b0 = model.intercept_
b1 = model.coef_

print("b0 [y-intercept]: ", b0)
print("b1 [gradient]: ", b1)
print("Equation: I = ", b1, "* V", b0)

vd = -b0/b1
rd = 1/b1

print("Vd = ", vd)
print("Rd = ", rd)

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()
plt.title("Blue Line: Prediction, Orange Points: Actual Data")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(V, I)
plt.xlabel("V/Volt")
plt.ylabel("I/Amps")
ax.plot(V, I)
ax.plot(V, model.predict(V))
plt.show()

