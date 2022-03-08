import sympy as sym
from sympy import *

print(" ")
print("Final-Exam Computational Mathematics: Problem 4")
print(" ")

print("============================================================")

print("The function is: y = x**3 + 4*x - 15")
x = sym.Symbol('x')

# calculate the analytical derivative function
df = sym.diff(x**3 + 4*x - 15)
print("It's derivative is: dy/dx =", df)

# calculate the analytical derivative value
df = lambdify(x, df)
analytical_value = df(0)
print('Analytical derivative value is: ', analytical_value)


# function
def f(x):
    return x**3 + 4*x - 15


# parameter: (function, value of x which y is to be calculated, method, step size)
def derivative(f, a, method, h):
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


print("============================================================")

print('Forward derivative approximation: ', derivative(f, 0, 'forward', 0.25))
print('Relative true error: ', relativeTrueError(derivative(f, 0, 'forward', 0.25), analytical_value), '%')

print("============================================================")

print('Backward derivative approximation: ', derivative(f, 0, 'backward', 0.25))
print('Relative true error: ', relativeTrueError(derivative(f, 0, 'backward', 0.25), analytical_value), '%')

print("============================================================")

print('Central difference derivative approximation: ', derivative(f, 0, 'central', 0.25))
print('Relative true error: ', relativeTrueError(derivative(f, 0, 'central', 0.25), analytical_value), '%')

print("============================================================")
