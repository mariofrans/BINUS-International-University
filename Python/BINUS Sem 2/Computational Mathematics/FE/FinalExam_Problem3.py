print(" ")
print("Final-Exam Computational Mathematics: Problem 3")
print(" ")

# function
def f(n):
    return 40*(n**1.5) - 875*n + 35000

# calculate the derivative of the function
def df(n):
    return (60.0*n)**(0.5) - 875

# xl = x lower
# xu = x upper
# es = relative approximation error tolerance

# bisection method
def bisection(xl, xu, es):
    i = 0
    xm_prev = 0
    while True:
        i = i + 1
        xm = (xl + xu) / 2
        ea = abs(100 * (xm - xm_prev) / xm)
        print(i, "iteration relative approximate error: ", ea)
        xm_prev = xm
        if (f(xl) * f(xm) < 0):
            xu = xm
        if (f(xl) * f(xm) > 0):
            xl = xm
        if (ea < es or f(xl) * f(xm) == 0):
            break
    return xm

# newton raphson method
def newton_raphson(xi, es):
    i = 0
    while True:
        i = i + 1
        xi_new = xi - f(xi) / df(xi)
        ea = abs(100 * (xi_new - xi) / xi_new)
        print(i, "interation relative approximate error: ", ea)
        xi = xi_new
        if (ea < es):
            break
    return xi_new

print("3a)============================================")
print("Bisection method:", bisection(350, 400, 3))
print("===============================================")
print(" ")

print("3b)============================================")
print("Newton Raphson method:", newton_raphson(390, 1))
print("==============================================")
print(" ")
