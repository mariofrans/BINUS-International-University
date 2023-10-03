a = -2
b = 4

def f(x):
    return 1-x-4*(x**3)+2*(x**5)

def integral(x):
        return x-((x**2)/2)-(x**4)+(x**6)/3

# (a) analytically
def findArea(a, b):
    if(a<0 & b>=0):
        return integral(b)-integral(0)+integral(0)-integral(a)
    else:
        return integral(b)-integral(a)
print(findArea(a,b))
print("===========================================")

# (b) single segment trapezoidal rule and relative true error
print("single segment trapezoidal rule and relative true error")
def trapezoidal(a, b):
    if((b-a)*((f(a)+f(b))/2)<0):
        return -(b-a)*((f(a)+f(b))/2)
    else:
        return (b-a)*((f(a)+f(b))/2)
print(trapezoidal(a,b))
print(100*((findArea(a,b)-trapezoidal(a,b))/findArea(a,b)))
print("===========================================")

# (c) multiple segment trapezoidal rule and relative true error
print("multiple segment trapezoidal rule and relative true error")
def trapezoidal(a, b, n):
    h = (b-a)/n
    sum = 0
    for i in range(n):
        sum = sum + ((a+(1+i)*h)-(a+(i*h)))*((f(a+(i*h)) + f(a+(1+i)*h))/2)
        if(sum<0):
            return -sum
        else:
            return sum
print(trapezoidal(a,b,4))
print(100*((findArea(a,b)-trapezoidal(a,b,4))/findArea(a,b)))
print("===========================================")

import scipy as sp
import numpy as np
from scipy import stats
import matplotlib.pyplot as plt
import math

# print(math.log(100,10)) -> #value, base
# print(math.log(math.e)) -> #e = math.e

# f = 2000*(math.log(140000/140000-2100t))-9.8t
# a = 8
# b = 30
#
#
#
# def f(t):
#     return 2000*(math.log(140000 / 140000 - (2100 * t), math.e)) - (9.8 * t)
#     # return 10*t
#
#
# def trapezoidal(a, b):
#     return (b-a)*((f(a)-f(b))/2)
#
# print(f(a))
# print(f(b))