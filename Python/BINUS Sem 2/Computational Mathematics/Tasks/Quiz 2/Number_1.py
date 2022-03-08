import math

print("Quiz 2: Number 1")
print("================================")

print("Number 1a: ")

def f(x, a):
    return 1-(math.e)**(-a*x)

a = 0.24
x1 = 0.1
dx = 0.05
x2 = x1+dx
exact_value = 0.23431

f2 = f(x2, a)
f1 = f(x1, a)

dy = (f2-f1)/dx
print("The derivative is: ", dy)
print("The exact value is: ", exact_value)

# calculating absolute true error function
def error(dy, exact_value):
    return abs(exact_value - dy)

# calculating relative true error function as percentage
def relativeTrueError(dy, exact_value):
    return (error(dy, exact_value)*100)/exact_value

print("The relative true error is: ", relativeTrueError(dy, exact_value), "%")


print("================================")
print("Number 1b: ")

a2 = 0.12
x1 = 0.1
dx = 0.05
x2 = x1+dx
exact_value = 0.23431

f2 = f(x2, a2)
f1 = f(x1, a2)

dy = (f2-f1)/dx
print("The derivative is: ", dy)
print("The estimate of the derivative decreased")
print("The new relative true error is: ", relativeTrueError(dy, exact_value), "%")

print("================================")