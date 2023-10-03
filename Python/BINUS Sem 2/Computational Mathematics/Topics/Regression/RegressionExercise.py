import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# df = pd.read_csv("COVID-19.csv")
# print(df)

x = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]).reshape(-1, 1)
y = np.array([369, 450, 514, 579, 686, 790, 893, 1046, 1155, 1285, 1414, 1528, 1677, 1790])

model = LinearRegression()
model.fit(x, y)

# print("Y-Intercept: ", model.intercept_)
# print("Gradient: ", model.coef_)


# Number a)
print("The current amount of people infected by COVID-19 is: ", y[13])

prediction = [0, 0, 0]
# Print the predictions:
for i in range(3):
    prediction[i] = model.coef_*(i+15) + model.intercept_
    print("The next ", i+1, " day/s prediction: ", prediction[i])


# Number c)
y_pred = model.predict(x)

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()
plt.title("Blue Line: Prediction, Orange Points: Actual Data")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x,y)
plt.xlabel("Days")
plt.ylabel("Number of Cases")
ax.plot(x, y)
ax.plot(x, y_pred)
plt.show()


# Number b)
def nonlin_reg(x, y, m):
    n = len(x)
    sx = []
    sxy = []
    sx_e = [[None for row in range(m + 1)] for col in range(m + 1)]
    sxy_e = []

    # calculate n,sigma x, sigma x^2, sigma x^3, ... , sigma x^2m
    # sx[0] = n, sx[1] = sigma x, sx[2] = sigma x^2, ..., s[m] = sigma x^2m
    print("Sigma x^i")
    for j in range(0, 2 * m + 1):  # from 0 until 2m
        if (j == 0):
            sx.append(n)
        else:
            s = 0
            for i in range(0, n):
                s = s + x[i] ** j
            sx.append(s)
        print(j, sx[j])
    print("\n")

    # calculate sigma y, sigma x^1.y, sigma x^2.y, ... , sigma x^m.y
    # sxy[0] = sigma x^0.y, sx[1] = sigma x^1.y, ..., sxy[m] = sigma x^m.y
    print("Sigma x^i.y")
    for j in range(0, m + 1):
        s = 0
        for i in range(0, n):
            s = s + x[i] ** j * y[i]
        sxy.append(s)
        print(j, sxy[j])
    print("\n")

    # create system of linear equation
    # sx^0.a0 + sx^1.a1 + ... + sx^m.am = sx^0.y
    # sx^1.a0 + sx^2.a1 + ... + sx^m+1.am = sx^1.y
    # ...
    # sx^m.a0 + sx^m+1.a1 + ... + sx^2m.am = sx^m.y
    # the variables i sx_e (left side of eq), the constants is sxy_e (right side of eq)
    print("System of linear equation")
    for i in range(0, m + 1):
        sxy_e.append(sxy[i])  # right side of eq
        for j in range(0, m + 1):
            k = i + j
            sx_e[j][i] = sx[k]  # left side of eq
            print(j, i, sx_e[j][i], sxy_e[i])

    # next step: solve the system of linear equation
    # solutions a0,a1, ..., am

x = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
y = [369, 450, 514, 579, 686, 790, 893, 1046, 1155, 1285, 1414, 1528, 1677, 1790]
yh = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for i in range(14):
    yh[i] = nonlin_reg(x,y,i)
