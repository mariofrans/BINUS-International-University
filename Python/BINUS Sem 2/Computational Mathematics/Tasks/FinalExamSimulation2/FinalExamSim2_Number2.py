print(" ")
print("Final Exam Simulation 2 Computational Mathematics: Number 2")
print(" ")

print("2a)==========================================================")

def dqdt(q):
    return (-5.33)*(10**-6)*(q + 33)*((-3.69)*(10**-6)*(q**4) + (2.33)*(10**-5)*(q**3) + (1.35)*(10**-3)*(q**2) + (5.42)*(10**-2)*(q) + 5.588)

# Function for euler method formula
def euler_method(t0, x0, h, t_final):
    while t0 < t_final:
        temp = x0
        x0 = x0 + h * dqdt(temp)
        t0 = t0 + h

    # approximation
    print("The temperature after ", t_final, " seconds is ", "%.6f" % x0)

euler_method(0, 27, 43200, 86400)

print("2b)==========================================================")

def dqdt(t, q):
    return (-5.33)*(10**-6)*(q + 33)*((-3.69)*(10**-6)*(q**4) + (2.33)*(10**-5)*(q**3) + (1.35)*(10**-3)*(q**2) + (5.42)*(10**-2)*(q) + 5.588)

# runge kutta 2nd order function
def rungeKutta2nd(t0, q0, t_final, h):
    # Count number of iterations using step size
    n = round((t_final - t0) / h)
    # Iterate for number of iterations
    q = q0
    for i in range(1, n + 1):
        # Apply Runge Kutta Formulas to find next value of q
        k1 = h * dqdt(t0, q)
        k2 = h * dqdt(t0 + 0.5 * h, q + 0.5 * k1)

        # Update next value of q and add it to array y
        q = q + (1.0 / 6.0) * (k1 + 2 * k2)

        # Update next value of t
        t0 = t0 + h

    return q

# 2nd Order Runge kutta 2nd approximation
ans = rungeKutta2nd(0, 27, 86400, 43200)
print("2nd Order Runge kutta approximation is ", ans)

print("2c)==========================================================")

# runge kutta 4th order function
def rungeKutta4th(t0, q0, t_final, h):
    # Count number of iterations using step size
    n = int((t_final - t0) / h)
    # Iterate for number of iterations
    q = q0
    for i in range(1, n + 1):
        # Apply Runge Kutta Formulas to find next value of q
        k1 = h * dqdt(t0, q)
        k2 = h * dqdt(t0 + 0.5 * h, q + 0.5 * k1)
        k3 = h * dqdt(t0 + 0.5 * h, q + 0.5 * k2)
        k4 = h * dqdt(t0 + h, q + k3)

        # Update next value of w and add it to array y
        q = q + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4)
        # Update next value of t
        t0 = t0 + h

    return q

# runge kutta 4th approximation
ans = rungeKutta4th(0, 27, 86400, 43200)
print("4th order runge kutta approximation is ", ans)

print("=============================================================")