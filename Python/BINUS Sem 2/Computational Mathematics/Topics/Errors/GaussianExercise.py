import scipy.integrate as integrate
from scipy.integrate import quad


# function
def f(x):
    return 1-x-4*(x**3)+2*(x**5)

# general formula for Two Point Trapezoidal
def gaussTwoPoint(a,b):
    c1 = (b-a)/2
    c2 = (b-a)/2
    root = (1/(3**(1/2)))
    d = (b + a) / 2
    a = c1*(-root)+d
    b = c2*root+d
    return abs(c1*(f(a))+c2*(f(b)))

print(gaussTwoPoint(6,2))
