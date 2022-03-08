import numpy as np

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


x = [2.20, 1.28, 0.66, 0.00, -0.60, -1.04, -1.20]
y = [0.00, 0.88, 1.14, 1.20, 1.04, 0.60, 0.00]

ans = lagrange(x, y, 1.10, 1)

print("The value of y at x = 1.10 is: ", ans)