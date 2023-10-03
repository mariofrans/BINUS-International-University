import math

sum = 0
x = 0.5

# function
y = math.log(1 + x)
print("The true value of the function for 10 terms: ")
print(y)
print(" ")

# a
# taylor series value 10 terms
print("a")
print("==================================")
print("Taylor series value for 10 terms: ")
for i in range(10):
    value = (x ** (i + 1) / (i + 1))
    sum = sum + ((-1) ** i) * value
print(sum)
# print(" ")

# true error
print("The true error if we use 10 terms is: ")
error = y - sum
print(error)
# print(" ")

# relative true error
print("The relative true error if we use 10 terms is: ")
print(error / y)
# print(" ")

print("The estimation is good enough as the error is very small")
print(" ")

# b
print("b")
print("==================================")
# taylor series value
print("taylor series value for 20 terms: ")
sum2 = 0
for i in range(20):
    value = (x ** (i + 1) / (i + 1))
    sum2 = sum2 + ((-1) ** i) * value
print(sum2)
# print(" ")

# true error
print("The true error if we use 20 terms is: ")
error2 = y - sum2
print(error)
# print(" ")

# relative true error
print("The relative true error if we use 20 terms is: ")
print(error / y)
print(" ")

# c
print("c")
print("==================================")
errorlimit = 0.05
sum3 = 0
relative_error = 1

for i in range(10):
    while relative_error >= errorlimit:
        value = (x ** (i + 1) / (i + 1))
        sum3 = sum3 + ((-1) ** i) * value
        print(i)
        relative_error = (y - sum3) / y

