import scipy as sc

#main function
def f(x):
    return (85*x - 91*(x**2) + 44*(x**3) - 8*(x**4) + x**5 - 26)

#values of xu and xl
xu = 1.0
xl = 0.5

#finding midpoint of xl and xu
def find_xm(xl, xu):
    return (xl - xu)/2

xm = find_xm(xl, xu)

#finding realative approximate error function
es = 10
def find_relativeApproxError(xm_new, xm):
    return abs((xm_new - xm)/xm_new)*100

# bisection formula
def bisection(xl, xm):
    if(f(xl)*f(xm) < 0):
        #root lies between xl and xm; then xl = xl ; xu = xm.
        xu = xm;
        xm_new = find_xm(xl, xu)
        rae = find_relativeApproxError(xm_new, xm)
        if(rae>es):
            bisection(xl, xm_new)
        if (rae < es):
            print("Algorithm Stopped when xm = ", xm, "The relative approximate error is: ", rae)

    if(f(xl)*f(xm) > 0):
        #root lies between xm and xu; then xl = xm;  xu = xu.
        xl = xm;
        xm_new = find_xm(xl, xu)
        rae = find_relativeApproxError(xm_new, xm)
        if (rae > es):
            bisection(xl, xm_new)
        if (rae < es):
            print("Algorithm Stopped when xm = ", xm, "The relative approximate error is: ", rae)

    if(f(xl)*f(xm) == 0):
        #then the root is xm
        print("The root is: ", xm)

bisection(xl, xm)


#values of xu and xl
xu = 1.0
xl = 0.5
xi = (xl - xu)/2
# x_new = 0
def newtonRaphson(xi):
    x2 = xi - (f(xi)/sc.misc.derivative(f(xi)))
    rae = find_relativeApproxError(x2, xi)
    if (rae > es):
        newtonRaphson(x2)
    if (rae < es):
        print("Algorithm Stopped when xm = ", xm, "The relative approximate error is: ", rae)

newtonRaphson(xi)

