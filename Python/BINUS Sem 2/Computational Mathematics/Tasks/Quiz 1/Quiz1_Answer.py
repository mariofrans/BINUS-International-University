# -*- coding: utf-8 -*-
"""Quiz 1.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1A2ouZ7tnQKLPkd2jrMSJ3E12xd_x1KxD
"""

# Commented out IPython magic to ensure Python compatibility.
import numpy as np
from matplotlib import pyplot as plt


# %matplotlib inline

def lin_reg(x, y):
    n = len(x)
    sx = 0  # sigma x
    sx2 = 0  # sigma x^2
    sy = 0  # sigma y
    sxy = 0  # sigma xy

    for i in range(0, n):
        sx = sx + x[i]
        sx2 = sx2 + x[i] ** 2
        sy = sy + y[i]
        sxy = sxy + x[i] * y[i]

    mx = sx / n  # average of x
    my = sy / n  # average of y

    a1 = (n * sxy - sx * sy) / (n * sx2 - sx ** 2)
    a0 = (sx2 * sy - sx * sxy) / (n * sx2 - sx ** 2)
    # a0 = my - a1*mx
    return a0, a1


def reg_line(a0, a1, x):
    yh = []
    n = len(x)
    for i in range(0, n):
        yh.append(a0 + a1 * x[i])  # line equation y = a0 + a1.x
    return yh


# Number 1
# ========
x = [0.6, 0.7, 0.8, 0.9, 1.0, 1.1]
y = [0.01, 0.05, 0.2, 0.7, 2, 4]
yh = []

b0, b1 = lin_reg(x, y)
print("Number 1")
print("I = ", b0, "+", b1, "V")
print("Vd = ", -b0 / b1, "Rd = ", 1 / b1)
yh = reg_line(b0, b1, x)
plt.plot(x, y, '.')
plt.plot(x, yh)
plt.show()


def gauss_elm(a, b):
    n = len(b)
    # Elimination Phase
    for k in range(0, n - 1):
        for i in range(k + 1, n):
            if a[i][k] != 0.0:
                lam = a[i][k] / a[k][k]
                for j in range(k + 1, n):
                    a[i][j] = a[i][j] - lam * a[k][j]
                b[i] = b[i] - lam * b[k]

    # Back substitution
    for k in range(n - 1, -1, -1):
        b[k] = (b[k] - np.dot(a[k][k + 1:n], b[k + 1:n])) / a[k][k]
    return b


def nonlin_reg(x, y, m):
    n = len(x)
    sx = []
    sxy = []
    sx_e = [[None for row in range(m + 1)] for col in range(m + 1)]
    sxy_e = []

    # calculate n,sigma x, sigma x^2, sigma x^3, ... , sigma x^2m
    # sx[0] = n, sx[1] = sigma x, sx[2] = sigma x^2, ..., s[m] = sigma x^2m
    # print("Sigma x^i")
    for j in range(0, 2 * m + 1):  # from 0 until 2m
        if (j == 0):
            sx.append(n)
        else:
            s = 0
            for i in range(0, n):
                s = s + x[i] ** j
            sx.append(s)
        # print(j,sx[j])
    # print("\n")

    # calculate sigma y, sigma x^1.y, sigma x^2.y, ... , sigma x^m.y
    # sxy[0] = sigma x^0.y, sx[1] = sigma x^1.y, ..., sxy[m] = sigma x^m.y
    # print("Sigma x^i.y")
    for j in range(0, m + 1):
        s = 0
        for i in range(0, n):
            s = s + x[i] ** j * y[i]
        sxy.append(s)
        # print(j,sxy[j])
    # print("\n")

    # create system of linear equation
    # sx^0.a0 + sx^1.a1 + ... + sx^m.am = sx^0.y
    # sx^1.a0 + sx^2.a1 + ... + sx^m+1.am = sx^1.y
    # ...
    # sx^m.a0 + sx^m+1.a1 + ... + sx^2m.am = sx^m.y
    # the variables i sx_e (left side of eq), the constants is sxy_e (right side of eq)
    # print("System of linear equation")
    for i in range(0, m + 1):
        sxy_e.append(sxy[i])  # right side of eq
        for j in range(0, m + 1):
            k = i + j
            sx_e[j][i] = sx[k]  # left side of eq
            # print(j,i,sx_e[j][i],sxy_e[i])
    return sx_e, sxy_e


def reg_curve(a, m, x):
    yh = []
    n = len(x)
    # yh = a0 + a1.x + a2.x^2 + ... + am.x^m
    for i in range(0, n):
        s = 0
        for j in range(0, m + 1):
            s = s + a[j] * x[i] ** j
        yh.append(s)
    return yh

    # next step: solve the system of linear equation
    # solutions a0,a1, ..., am


# Number 2
# ========

x = [804.184, 827.326, 846.611, 869.753, 889.038, 892.895, 900.609]
y = [0.1591, 0.0439, 0.0050, 0.0073, 0.0448, 0.0649, 0.1204]
xh = list(range(800, 910, 1))
yh = []
z = []
c = []
order = 2
z, c = nonlin_reg(x, y, order)
a = gauss_elm(z, c)
yh = reg_curve(a, order, xh)
print("Number 2")
print(a[0], "+", a[1], "m + ", a[2], "m^2 = 0")
plt.plot(x, y, '.')
plt.plot(xh, yh)
plt.show()


# Calculate (f(xa)-f(xb)) / ((xa-xb))
def dy_dx(xa, xb, ya, yb):
    return (ya - yb) / (xa - xb)


def newton(x, y, xp, n):
    b = [[None for row in range(n + 1)] for col in range(n + 1)]
    b[0][0] = y[0]
    # Calculate b0,b1,...bn by represents b as a matrix b[i,j]:
    # b[0,0]=b0
    #         >  b[1,0]=b1
    # b[0,1]             > b[2,0]=b2
    #         >  b[1,1]            > b[3,0]=b3
    # b[0,2]             > b[2,1]
    #         >  b[1,2]
    # b[0,3]
    # Then
    # b[1,0] = (b[0,1]-b[0,0]) / (x[1]-x[0])
    # or
    # b[i,j] = (b[i-1,j+1]-b[i-1][j]) / (x[j+i]-x[j])
    for i in range(0, n + 1):
        for j in range(0, n + 1 - i):
            if (i == 0):
                b[i][j] = y[j]
            else:
                b[i][j] = dy_dx(x[j + i], x[j], b[i - 1][j + 1], b[i - 1][j])

    # Estimate y at xp using polynomial
    # b0 +  b1.(xp-x0) + b2.(xp-x0)(xp-x1) + ... + bn.(xp-x0)(xp-x1)...(xp-xn-1)
    #             m                m                               m
    yp = b[0][0]
    for i in range(1, n + 1):
        m = 1
        for j in range(0, i):
            m = m * (xp - x[j])
        yp = yp + b[i][0] * m
    return yp


# x = [0,-1,-2,-3,-4,-5,-6,-7,-8,-9,-10]
x = [-7, -8]
# y = [19.1,19.1,19,18.8,18.7,18.3,18.2,17.6,11.7,9.9,9.1]
y = [17.6, 11.7]
print("Number 3")
plt.plot(x, y, '.')
yp = newton(x, y, -7.5, 1)
print("Newton:", yp)


def lagrange(x, y, xp, n):
    # Calculate l[i], l0,l1,...,ln
    l = []
    for i in range(0, n + 1):
        m = 1
        for j in range(0, n + 1):
            if (j != i):
                m = m * (xp - x[j]) / (x[i] - x[j])
        l.append(m)

    # Estimate yp at xp using polynomial
    # l[0].y[0] + l[1].y[1] + ... + l[n].y[n]
    yp = 0
    for i in range(0, n + 1):
        yp = yp + l[i] * y[i]
    return yp


print("Number 4")
x = [1.28, 0.66]
y = [0.88, 1.14]

yp = lagrange(x, y, 1.1, 1)
print("Lagrange:", yp)


def f(x):
    return 40 * x ** 1.5 - 875 * x + 35000


def bisection(xl, xu, es):
    i = 0
    xm_prev = 0
    while True:
        i = i + 1
        xm = (xl + xu) / 2
        ea = abs(100 * (xm - xm_prev) / xm)
        print(i, "ea = ", ea)
        xm_prev = xm
        if (f(xl) * f(xm) < 0):
            xu = xm
        if (f(xl) * f(xm) > 0):
            xl = xm
        if (ea < es or f(xl) * f(xm) == 0):
            break
    return xm


print("Number 5")
print("root:", bisection(50, 100, 0.1))


def f(x):
    return 40 * x ** 1.5 - 875 * x + 35000


def df(x):  # derivative of f(x)
    return 60 * x ** 0.5 - 875


def newton_raphson(xi, es):
    i = 0
    while True:
        i = i + 1
        xi_new = xi - f(xi) / df(xi)
        ea = abs(100 * (xi_new - xi) / xi_new)
        print(i, "ea = ", ea)
        xi = xi_new
        if (ea < es):
            break
    return xi_new


print("Number 6")
print("root:", newton_raphson(50, 0.1))