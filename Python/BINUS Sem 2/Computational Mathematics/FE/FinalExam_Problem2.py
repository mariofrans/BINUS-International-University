import numpy as np
import matplotlib.pyplot as plt

print(" ")
print("Final-Exam Computational Mathematics: Problem 2")
print(" ")

# gauss elimination function
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

# direct method function; parameters = (x, y, value of x which y is to be calculated, order number)
def direct(x, y, xp, n):
    b = [[None for row in range(n + 1)] for col in range(n + 1)]
    c = [None for row in range(n + 1)]

    for i in range(0, n + 1):
        c[i] = y[i]
        for j in range(0, n + 1):
            b[i][j] = x[i] ** j

    # Solve the system of linear equation using gauss elimination, a0,a1,...,an
    a = gauss_elm(b, c)

    # Estimate y for x = xp using polynomial a0 + a1.xp + a2.xp^2 + ... + an.x^n
    yp = 0
    for i in range(0, n + 1):
        yp = yp + a[i] * xp ** i
    return yp

# derivative function
def dy_dx(xa, xb, ya, yb):
    return (ya - yb) / (xa - xb)

# newton method function; parameters = (x, y, value of x which y is to be calculated, order number)
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
    # print(yp)
    for i in range(1, n + 1):
        m = 1
        for j in range(0, i):
            m = m * (xp - x[j])
        yp = yp + b[i][0] * m
        # print(b[i][0])
    return yp

# lagrange method function; parameters = (x, y, value of x which y is to be calculated, order number)
def lagrange(x, y, xp, n):
    # Calculate l[i]
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

# table data
x = np.array([1.6, 2, 2.5, 3.2, 4, 4.5])
y = np.array([2, 8, 14, 15, 8, 2])

# calculating relative true error function as percentage
def relativeApproximationError(x1, x2):
    return abs(x2 - x1/x1)

print("2a)============================================")
print("Direct method order 2: ", direct(x, y, 3, 2))
print("Direct method order 3: ", direct(x, y, 3, 3))
print("===============================================")
print(" ")

print("2b)============================================")
print("Newton method order 2: ", newton(x, y, 3, 2))
print("Newton method order 3: ", newton(x, y, 3, 3))
print("===============================================")
print(" ")

print("2c)============================================")
print("Lagrange method order 2: ", lagrange(x, y, 3, 2))
print("Lagrange method order 3: ", lagrange(x, y, 3, 3))
print("===============================================")
print(" ")

print("2d)============================================")
print("Relative True Error of Direct Method 2&3: ", relativeApproximationError(direct(x, y, 3, 2), direct(x, y, 3, 3)))
print("Relative True Error of Newton Method 2&3: ", relativeApproximationError(newton(x, y, 3, 2), newton(x, y, 3, 3)))
print("Relative True Error of Lagrange Method 2&3: ", relativeApproximationError(lagrange(x, y, 3, 2), lagrange(x, y, 3, 3)))
print("===============================================")
print(" ")

print("2e)============================================")
print("3 graphs will be plotted (Direct, Newton, Lagrange) & windows will be launched for each")

x = np.array([1.6, 2, 2.5, 3, 3.2, 4, 4.5])

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()

# direct method 2&3 plot
y_direct1 = np.array([2, 8, 14, direct(x, y, 3, 2), 15, 8, 2])
y_direct2 = np.array([2, 8, 14, direct(x, y, 3, 3), 15, 8, 2])

plt.suptitle("DIRECT METHOD INTERPOLATION")
plt.title("Legends: Orange Point & Line: Order 2, Blue Point & Line: Order 3", fontsize=10)

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x, y_direct1)
ax.scatter(x, y_direct2)
plt.xlabel("x")
plt.ylabel("f(x)")
ax.plot(x, y_direct1)
ax.plot(x, y_direct2)
plt.show()

# newton method 2&3 plot
y_newton1 = np.array([2, 8, 14, newton(x, y, 3, 2), 15, 8, 2])
y_newton2 = np.array([2, 8, 14, newton(x, y, 3, 3), 15, 8, 2])

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()

plt.suptitle("NEWTON METHOD INTERPOLATION")
plt.title("Legends: Orange Point & Line: Order 2, Blue Point & Line: Order 3", fontsize=10)

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x, y_newton1)
ax.scatter(x, y_newton2)
plt.xlabel("x")
plt.ylabel("f(x)")
ax.plot(x, y_newton1)
ax.plot(x, y_newton2)
plt.show()

# lagrange method 2&3 plot
y_lagrange1 = np.array([2, 8, 14, lagrange(x, y, 3, 2), 15, 8, 2])
y_lagrange2 = np.array([2, 8, 14, lagrange(x, y, 3, 3), 15, 8, 2])

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()

plt.suptitle("LAGRANGE METHOD INTERPOLATION")
plt.title("Legends: Orange Point & Line: Order 2, Blue Point & Line: Order 3", fontsize=10)

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x, y_lagrange1)
ax.scatter(x, y_lagrange2)
plt.xlabel("x")
plt.ylabel("f(x)")
ax.plot(x, y_lagrange1)
ax.plot(x, y_lagrange2)
plt.show()

print("===============================================")