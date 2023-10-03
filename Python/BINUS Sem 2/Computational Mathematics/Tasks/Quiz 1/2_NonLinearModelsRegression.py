import numpy as np
import matplotlib.pyplot as plt
# from sklearn.linear_model import LinearRegression
from sklearn.svm import SVR

m = np.array([804.184, 827.326, 846.611, 869.753, 889.038, 892.895, 900.609]).reshape(-1, 1)
P = np.array([0.1591, 0.0439, 0.0050, 0.0073, 0.0448, 0.0649, 0.1204])

# model = LinearRegression()
# model.fit(V, I)

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

nonlin_reg(m, P, 2)

# plt.style.use('ggplot')
# fig = plt.figure("Christensen Mario Frans"); plt.clf()
#
# ax = fig.add_subplot(1, 1, 1)
# ax.scatter(m, P)
# plt.xlabel("Wavenumber/m")
# plt.ylabel("Absorbance/P")
# ax.plot(m, nonlin_reg(m, P, 2))
# plt.show()


