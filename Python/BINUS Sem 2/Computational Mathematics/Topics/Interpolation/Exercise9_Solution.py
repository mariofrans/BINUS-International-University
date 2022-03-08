import numpy as np


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
    print(yp)
    for i in range(1, n + 1):
        m = 1
        for j in range(0, i):
            m = m * (xp - x[j])
        yp = yp + b[i][0] * m
        print(b[i][0])
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


x = [10, 15, 20, 22.5]
y = [227.04, 362.78, 517.35, 602.97]

yp1 = direct(x, y, 16, 3)
yp2 = newton(x, y, 16, 3)
yp3 = lagrange(x, y, 16, 3)

print("Direct:", yp1)
print("Newton:", yp2)
print("Lagrange:", yp3)