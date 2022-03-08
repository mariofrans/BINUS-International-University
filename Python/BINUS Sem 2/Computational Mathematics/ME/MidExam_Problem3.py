import matplotlib.pyplot as plt
import numpy as np

print(" ")
print("Mid-Exam Computational Mathematics: Problem 3")
print(" ")

print("Problem 3 =======================================================")

# n is number of panels
# a is lower x value
# b is upper x value
def simp(a,b,n):
    dx = (b-a)/n
    x = np.linspace(a,b,n+1)
    # f(x) = sin(x)
    y = np.sin(x)
    sum = (dx/3)*np.sum(y[0:-1:2] + 4*y[1::2] + y[2::2])
    return sum

print("The area if calculated using 4 panels is: ", simp(0, np.pi, 4))
print("The area if calculated using 6 panels is: ", simp(0, np.pi, 6))
print("The area if calculated using 8 panels is: ", simp(0, np.pi, 8))
print("The area if calculated using 10 panels is: ", simp(0, np.pi, 10))


print("=================================================================")
print(" ")