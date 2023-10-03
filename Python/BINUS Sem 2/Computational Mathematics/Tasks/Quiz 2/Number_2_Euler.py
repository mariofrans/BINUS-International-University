print("Quiz 2: Number 2")
print("================================")

# dx/dt function
def dxdt(x):
    return 37.5 - (3.5)*x

# Function for euler method formula
def euler_method(t0, x0, h, t_final):
    while t0 < t_final:
        temp = x0
        x0 = x0 + h * dxdt(temp)
        t0 = t0 + h

    # approximation
    print("Answer = ", t_final, " is ", "%.6f" % x0)

euler_method(0, 50, 1.5, 3)

