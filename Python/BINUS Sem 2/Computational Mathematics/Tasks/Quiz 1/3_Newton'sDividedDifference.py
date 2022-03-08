
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

z = [0, -1, -2, -3, -4, -5, -6, -7, -8, -9, -10]
T = [19.1, 19.1, 19, 18.8, 18.7, 18.3, 18.2, 17.6, 11.7, 9.9, 9.1]

ans = newton(z, T, -7.5, 1)
print("The value of T at z = -7.5 is: ", ans)

