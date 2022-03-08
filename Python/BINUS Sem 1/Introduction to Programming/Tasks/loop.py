val = "*"


a = 0
while a < 5:

    print(val*(a+1))
    a += 1

print(" ")

b = 6
while b > 0:
    print(val*(b-1))
    b -= 1

print(" ")

c = 5
d = 0
while c > 0:
    print(" "*(c-1), val*(d+1))
    c -= 1
    d += 1

print(" ")

e = 6
f = -1
while e > 0:
    print(" "*(f+1), val*(e-1))
    e -= 1
    f += 1

print(" ")

g = 5
h = 0
while g > 0:
    print(" "*(g-1), val*(2*h+1))
    g -= 1
    h += 1
i = 6
j = -1
while i > 0:
    print(" "*(j+1), val*(2*i-3))
    i -= 1
    j += 1


for k in range(5):
    print(val)

