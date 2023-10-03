print(" ")
print("Final-Exam Computational Mathematics: Problem 5")
print(" ")

print("5a)==========================================================")
print(" ")
print("Euler method: ")

# derivative of function
def dwdt(w):
    return 1000 - 3*w

# Euler method
def euler_method(t0, w0, h, t_final):
    while t0 < t_final:
        temp = w0
        w0 = w0 + h * dwdt(temp)
        t0 = t0 + h

    # Euler approximation
    print("The speed at ", t_final, " seconds is ", "%.6f" % w0)

euler_method(0, 0, 0.1, 0.8)

print(" ")
print("5b)==========================================================")
print(" ")
print("Runge-Kutta 2nd Order method: ")

# derivative of function
def dwdt(t, w):
    return 1000 - 3*w

# runge kutta 2nd order function
def rungeKutta2nd(t0, w0, t_final, h):
    # Count number of iterations using step size
    n = round((t_final - t0) / h)
    # Iterate for number of iterations
    w = w0
    for i in range(1, n + 1):
        # Apply Runge Kutta Formulas to find next value of w
        k1 = h * dwdt(t0, w)
        k2 = h * dwdt(t0 + 0.5 * h, w + 0.5 * k1)

        # Update next value of w
        w = w + (1.0 / 6.0) * (k1 + 2 * k2)

        # Update next value of t
        t0 = t0 + h

    return w

# 2nd Order Runge kutta approximation
ans = rungeKutta2nd(0, 0, 0.8, 0.1)
print("The speed at ", 0.8, " seconds is ", "%.6f" % ans)

print(" ")
print("5c)==========================================================")
print(" ")
print("Runge-Kutta 4th Order method: ")

# runge kutta 4th order function
def rungeKutta4th(t0, w0, t_final, h):
    # Count number of iterations using step size
    n = (int)((t_final - t0) / h)
    # Iterate for number of iterations
    w = w0
    for i in range(1, n + 1):
        # Apply Runge Kutta Formulas to find next value of w
        k1 = h * dwdt(t0, w)
        k2 = h * dwdt(t0 + 0.5 * h, w + 0.5 * k1)
        k3 = h * dwdt(t0 + 0.5 * h, w + 0.5 * k2)
        k4 = h * dwdt(t0 + h, w + k3)

        # Update next value of w
        w = w + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4)

        # Update next value of t
        t0 = t0 + h

    return w

# runge kutta 4th order approximation
ans = rungeKutta4th(0, 0, 0.8, 0.1)
print("The speed at ", 0.8, " seconds is ", "%.6f" % ans)

print(" ")
print("=============================================================")