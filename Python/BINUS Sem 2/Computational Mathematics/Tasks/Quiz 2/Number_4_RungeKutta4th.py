import numpy as np
import matplotlib.pyplot as plt

print("Quiz 2: Number 4")
print("================================")

# dw/dt function
def dcdt(t, c):
    return -0.06*c

# create empty array to store each step's values
x = [0, 3.5, 7]
y = [10**7]

# runge kutta 4th order function
def rungeKutta(t0, c0, t_final, h):
    # Count number of iterations using step size
    n = (int)((t_final - t0) / h)
    # Iterate for number of iterations
    c = c0
    for i in range(1, n + 1):
        # Apply Runge Kutta Formulas to find next value of w
        k1 = h * dcdt(t0, c)
        k2 = h * dcdt(t0 + 0.5 * h, c + 0.5 * k1)
        k3 = h * dcdt(t0 + 0.5 * h, c + 0.5 * k2)
        k4 = h * dcdt(t0 + h, c + k3)

        # Update next value of w and add it to array y
        c = c + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4)
        y.append(c)
        # Update next value of t
        t0 = t0 + h

    return c

# runge kutta approximation
ans = rungeKutta(0, 10**7, 7, 3.5)
print("4th order runge kutta approximation is:", ans)

exact_value = 6.5705*(10**6)
print("The exact value of w(0.8) =", exact_value);

# calculating absolute true error function
def error(ans, exact_value):
    return abs(exact_value - ans)

# calculating relative true error function as percentage
def relativeTrueError(ans, exact_value):
    return (error(ans, exact_value)*100)/exact_value

print("The relative true error is: ", relativeTrueError(ans, exact_value), "%")


# plot the graph
plot_x = np.array(x).reshape(-1, 1)
plot_y = np.array(y)

plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()
plt.title("Runge Kutta 4th Order")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(plot_x, plot_y)
plt.xlabel("Time/Weeks")
plt.ylabel("Concentration/(parts/m^3)")
ax.plot(plot_x, plot_y)
plt.show()