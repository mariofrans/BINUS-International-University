import math
import numpy as np
import matplotlib.pyplot as plt

print(" ")
print("Mid-Exam Computational Mathematics: Problem 2")
print(" ")

print("Problem 2a ==================================================")
# taylor series for function of ln(x)
def taylor(x, n):
    taylor = 0
    for i in range(n):
        taylor = taylor + ((-1)**i)*(((x-1)**(i+1))/(i+1))
    return taylor

# exact value of ln(2)
exact_value = math.log(2)

# calculating absolute true error function
def error(x, n):
    return abs(exact_value - taylor(x, n))

# calculating relative true error function as percentage
def relativeTrueError(x, n):
    return (error(x, n)*100)/exact_value

print("The exact value of ln(2) is: ", exact_value)
print("The taylor function value for ln(2) is: ", taylor(2, 5))
print("The absolute true error using 5 terms is: ", error(2,5))
print("The relative true error using 5 terms is: ", relativeTrueError(2,5))
print("In my opinion, this estimation is not good enough as the relative true error is larger than 10%")
print("=============================================================")
print(" ")

print("Problem 2b ==================================================")
print("Please wait... problem 2b takes sometime to load...")
# find absolute true error term
def findErrorTerm(x, findError):
    t = 1
    while(error(x,t)>findError):
        t = t+1
    return t

print("Number of terms to get absolute true error < 0.0001 is: ", findErrorTerm(2, 0.0001))
print("=============================================================")
print(" ")

print("Problem 2c ==================================================")
# find relative percentage error term
def findRelativeTerm(x, findError):
    t = 1
    while(relativeTrueError(x,t)>findError):
        t = t+1
    return t

print("Number of terms to get the absolute relative approximate error < 0.1 % is: ", findRelativeTerm(2, 0.1))
print("=============================================================")
print(" ")

print("Problem 2d ==================================================")
# terms used from 1-10
terms_number = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]).reshape(-1, 1)
# value of taylor series of ln(2) using the terms
approximate_error = np.array([0, 0, 0, 0, 0, 0, 0, 0, 0, 0]).reshape(-1, 1)

for i in range(10):
    approximate_error[i] = relativeTrueError(2, i+1)

# create graph of the data
plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()

plt.title("Number of Terms VS Approximate Error Graph")
ax = fig.add_subplot(1, 1, 1)
plt.xlabel("Number of terms")
plt.ylabel("Approximate error")
ax.plot(terms_number, approximate_error)
plt.show()

print("=============================================================")
print(" ")


