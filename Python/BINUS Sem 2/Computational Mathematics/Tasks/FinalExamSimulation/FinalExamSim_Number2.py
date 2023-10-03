import numpy as np
import matplotlib.pyplot as plt

print(" ")
print("Final Simulation Computational Mathematics: Number 2")
print(" ")

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

# parameters = (x, y, value of x which y is to be calculated, order number)

def direct(x, y, xp, n):
    b = [[None for row in range(n + 1)] for col in range(n + 1)]
    c = [None for row in range(n + 1)]

    # Create system of linear equation
    # b(0,0).a0 + b(0,1).a1 + ... + b(0,n).an = c0
    # b(1,0).a0 + b(1,1).a1 + ... + b(1,n).an = c1
    # ...
    # b(n,0).a0 + b(n,1).a1 + ... + b(n,n).an = cn
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
    # print(yp)
    for i in range(1, n + 1):
        m = 1
        for j in range(0, i):
            m = m * (xp - x[j])
        yp = yp + b[i][0] * m
        # print(b[i][0])
    return yp


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
x = np.array([1.2, 2.1, 2.4, 3.3, 4.2, 4.6])
y = np.array([2, 7, 15, 16, 9, 3])

# calculating relative true error function as percentage
def relativeApproximationError(x1, x2):
    return abs(x2 - x1/x1)

print("a)============================================")
print("Direct method order 1: ", direct(x, y, 3.5, 1))
print("Direct method order 2: ", direct(x, y, 3.5, 2))
print("==============================================")
print(" ")

print("b)============================================")
print("Newton method order 1: ", newton(x, y, 3.5, 1))
print("Newton method order 2: ", newton(x, y, 3.5, 2))
print("==============================================")
print(" ")

print("c)============================================")
print("Lagrange method order 1: ", lagrange(x, y, 3.5, 1))
print("Lagrange method order 2: ", lagrange(x, y, 3.5, 2))
print("==============================================")
print(" ")

print("d)============================================")
print("Relative True Error of Direct Method 1&2: ", relativeApproximationError(direct(x, y, 3.5, 1), direct(x, y, 3.5, 2)))
print("Relative True Error of Newton Method 1&2: ", relativeApproximationError(newton(x, y, 3.5, 1), newton(x, y, 3.5, 2)))
print("Relative True Error of Lagrange Method 1&2: ", relativeApproximationError(lagrange(x, y, 3.5, 1), lagrange(x, y, 3.5, 2)))
print("==============================================")
print(" ")


print("e)============================================")
print("3 graphs will be plotted; Direct, Newton, Lagrange")

x = np.array([1.2, 2.1, 2.4, 3.3, 3.5, 4.2, 4.6])

# direct method 1&2 plot
y_direct1 = np.array([2, 7, 15, 16, direct(x, y, 3.5, 1), 9, 3])
y_direct2 = np.array([2, 7, 15, 16, direct(x, y, 3.5, 2), 9, 3])

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()
plt.title("DIRECT; Orange Line: Order 1, Blue Line: Order 2")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x, y_direct1)
ax.scatter(x, y_direct2)
plt.xlabel("x")
plt.ylabel("f(x)")
ax.plot(x, y_direct1)
ax.plot(x, y_direct2)
plt.show()

# newton method 1&2 plot
y_newton1 = np.array([2, 7, 15, 16, newton(x, y, 3.5, 1), 9, 3])
y_newton2 = np.array([2, 7, 15, 16, newton(x, y, 3.5, 2), 9, 3])

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()
plt.title("NEWTON; Orange Line: Order 1, Blue Line: Order 2")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x, y_newton1)
ax.scatter(x, y_newton2)
plt.xlabel("x")
plt.ylabel("f(x)")
ax.plot(x, y_newton1)
ax.plot(x, y_newton2)
plt.show()

# lagrange method 1&2 plot
y_lagrange1 = np.array([2, 7, 15, 16, lagrange(x, y, 3.5, 1), 9, 3])
y_lagrange2 = np.array([2, 7, 15, 16, lagrange(x, y, 3.5, 2), 9, 3])

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()
plt.title("LAGRANGE; Orange Line: Order 1, Blue Line: Order 2")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(x, y_lagrange1)
ax.scatter(x, y_lagrange2)
plt.xlabel("x")
plt.ylabel("f(x)")
ax.plot(x, y_lagrange1)
ax.plot(x, y_lagrange2)
plt.show()

print("==============================================")