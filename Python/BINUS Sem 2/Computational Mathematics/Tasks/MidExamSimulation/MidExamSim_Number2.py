import math

print(" ")
print("Exam Simulation Computational Mathematics: Number 2")
print(" ")

print("The exact value of arctan(0.5) is: ", math.atan(0.5))
print(" ")

# taylor series function:
def f(x, t):
    f = 0
    for i in range(0,t):
        f = f + (-1**i)*((x**(2*i + 1))/(2*i + 1))
    return f

# calculating absolute true error function
def error(x,t):
    return abs(math.atan(x)-f(x, t))

print("The value of arctan(0.5) if we use 5 terms in the taylor series is: ",f(0.5, 5))
print("The absolute true error is: ", error(0.5, 5))
for i in range(300):
    print(f(0.5,i))

print("In my opinion, the error is still too big, thus, the estimation is not good enough")
print(" ")

print("Number 2a ==========================================")
#
# find_error = 0.0001
# def find_term(x):
#     find_terms = 1
#     while(error(x, find_terms)>=0.0001):
#         find_terms = find_terms + 1
#     # if(error(0.5, find_terms)<0.0001):
#     return find_terms
#
# print(find_term(0.5))
