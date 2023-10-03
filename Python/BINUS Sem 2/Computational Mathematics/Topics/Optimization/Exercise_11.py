from __future__ import division
from numpy import *
import scipy.optimize as opt
from scipy import optimize
import scipy
from sympy import *
from math import *

print("Exercise 11")
print("======================================")
print(" ")
print("Number 1a) ===========================")

x = Symbol('x')

# function
f = -(x**2) + 8*x - 12
# 1st derivative
df = f.diff(x)
# 2nd derivative
ddf = df.diff(x)

# turn all into functions
f = lambdify(x, f)
df = lambdify(x, df)
ddf = lambdify(x, ddf)

root = scipy.optimize.fmin(lambda x: -f(x), 0)

print(" ")
print("The turning point is: ", float(root))

if(ddf(int(root)) < 0):
    print("This is the maximum point")
elif(ddf(int(root)) > 0):
    print("This is the minimum point")

print("======================================")

print("Number 1b) ===========================")

# find root using newton method
root = optimize.newton(df, 0)
print("Root (Newton Method): ", float(root))

if(ddf(int(root)) < 0):
    print("This is the maximum point")
elif(ddf(int(root)) > 0):
    print("This is the minimum point")

print("======================================")

print("Number 2a) ===========================")

# function
f = 4*x - 1.8*x**2 + 1.2*x**3 - 0.3*x**4
# 1st derivative
df = f.diff(x)
# 2nd derivative
ddf = df.diff(x)

# turn all into functions
f = lambdify(x, f)
df = lambdify(x, df)
ddf = lambdify(x, ddf)

# find root using newton method
root = optimize.newton(df, 3)
print("Root (Newton Method): ", float(root))

if(ddf(int(root)) < 0):
    print("This is the maximum point")
elif(ddf(int(root)) > 0):
    print("This is the minimum point")

print("======================================")

print("Number 2b) ===========================")

# Golden-section search
def GSS_iter(xL, xR, es):
    phi = (1.0 + sqrt(5.0)) / 2.0
    iter = 1

    err = 100.0  # Initial error (%)

    # Print column headers
    print
    '%s\t%s\t%s\t%s' % ('Iter.', 'xopt', 'f(xopt)', 'Error %')

    # Iterate until termination criterion is reached
    while err > es:

        d = (phi - 1) * (xR - xL)
        a = xR - d
        b = xL + d

        if f(b) < f(a):

            xopt = a
            xR = b

        else:

            xopt = b
            xL = a

        err = ((2.0 - phi) * abs((xR - xL) / xopt)) * 100.0

        # Print iteration, x-optimal, f(x-optimal), %Error
        print
        ' %s\t%s\t%s\t%s' % (int(iter),
                             round(xopt, 4),
                             round(f(xopt), 4),
                             round(err, 5))
        iter += 1

    return xopt

es = 0.1  # Stopping criterion
xL = 2  # Initial guesses
xR = 4

# Call the iterative solver
xopt = GSS_iter(xL, xR, es)
print("Root (Golden Section Search): ", float(xopt))

if(ddf(int(root)) < 0):
    print("This is the maximum point")
elif(ddf(int(root)) > 0):
    print("This is the minimum point")

print("======================================")

print("Number 2c) ===========================")

root = scipy.optimize.fmin(lambda x: -f(x), 0)
print(" ")
print("Root (Quadratic Interpolation): ", float(root))

if(ddf(int(root)) < 0):
    print("This is the maximum point")
elif(ddf(int(root)) > 0):
    print("This is the minimum point")

print("======================================")