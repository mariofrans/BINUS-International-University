import numpy as np
from sklearn.linear_model import LinearRegression
import matplotlib.pyplot as plt

print(" ")
print("Final-Exam Computational Mathematics: Problem 1")
print(" ")

print("================================================================")

# given table data: t = hours, h = millimeters
t = np.array([30, 33, 34, 35, 39, 44, 45]).reshape(-1, 1)
h = np.array([1.10, 1.21, 1.25, 1.23, 1.30, 1.40, 1.42])

# create linear regression model
model = LinearRegression()
model.fit(t, h)

# m = gradient, c = y-intercept
m = float(model.coef_)
c = float(model.intercept_)

# print gradient and y-intercept value
print("Y-Intercept: ", c)
print("Gradient: ", m)
print(" ")

# print equation of regressed line
print("The equation of line is: ")
print("h = ", m, "* t +", c)

# print predicted value of 't' when 'h' = 2
print(" ")
print("The predicted value of 't' when 'h' = 2 is: ", (2 - c)/m)

print(" ")
print("================================================================")

# create new array for best fit line
x = np.array([30, 33, 34, 35, 39, 44, 45, 80]).reshape(-1, 1)
y = []

for i in range(8):
    y.append((x[i]*m)+c)

y = np.array(y)

# create graph for the data
fig = plt.figure("Christensen Mario Frans"); plt.clf()

plt.suptitle("LINEAR REGRESSION")
plt.title("Legends: Blue Line: Linear Regression, Green Points: Table Data, Red Point: Predicted Data", fontsize=10)

plt.style.use('ggplot')
plt.xlabel("t/hour")
plt.ylabel("h/mm")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(t, h, color='g')
ax.plot(x, y, color='b')
ax.scatter((2 - c)/m, 2, color='r')
plt.show()

print(" ")
print("================================================================")
