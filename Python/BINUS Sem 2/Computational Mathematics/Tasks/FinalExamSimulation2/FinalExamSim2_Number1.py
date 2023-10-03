import math
import sympy as sym
from sympy import *

print(" ")
print("Final Exam Simulation 2 Computational Mathematics: Number 1")
print(" ")

print("============================================================")

print("The function is: (x**2)*(math.cos(x))")
x = sym.Symbol('x')

# calculate the analytical derivative function
df = sym.diff((x**2)*(sym.cos(x)))
print("It's derivative is: ", df)

# calculate the analytical derivative value
df = lambdify(x, df)
analytical_value = df(0.4)
print('Analytical derivative value is: ', analytical_value)

print("============================================================")

def f(x):
    return (x**2)*(math.cos(x))

# parameter: (function, value of x which y is to be calculated, method, step size)
def derivative(f, a, method, h):

    # '''Compute the difference formula for f'(a) with step size h.
    #
    # Parameters
    # ----------
    # f : function
    #     Vectorized function of one variable
    # a : number
    #     Compute derivative at x = a
    # method : string
    #     Difference formula: 'forward', 'backward' or 'central'
    # h : number
    #     Step size in difference formula
    #
    # Returns
    # -------
    # float
    #     Difference formula:
    #         central: f(a+h) - f(a-h))/2h
    #         forward: f(a+h) - f(a))/h
    #         backward: f(a) - f(a-h))/h
    # '''

    if method == 'central':
        return (f(a + h) - f(a - h))/(2*h)
    elif method == 'forward':
        return (f(a + h) - f(a))/h
    elif method == 'backward':
        return (f(a) - f(a - h))/h
    else:
        raise ValueError("Method must be 'central', 'forward' or 'backward'.")

# calculating relative true error function as percentage
def relativeTrueError(approx, true):
    return abs((true - approx)/true)*100

print('Forward derivative approximation: ', derivative(f, 0.4, 'forward', 0.1))
print('Relative true error: ', relativeTrueError(derivative(f, 0.4, 'forward', 0.1), analytical_value), '%')

print("============================================================")

print('Backward derivative approximation: ', derivative(f, 0.4, 'backward', 0.1))
print('Relative true error: ', relativeTrueError(derivative(f, 0.4, 'backward', 0.1), analytical_value), '%')

print("============================================================")

print('Central difference derivative approximation: ', derivative(f, 0.4, 'central', 0.1))
print('Relative true error: ', relativeTrueError(derivative(f, 0.4, 'central', 0.1), analytical_value), '%')

print("============================================================")


# link: https://towardsdatascience.com/taking-derivatives-in-python-d6229ba72c64