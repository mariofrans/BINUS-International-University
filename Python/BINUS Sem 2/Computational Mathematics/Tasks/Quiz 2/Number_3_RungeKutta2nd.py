import numpy as np
import matplotlib.pyplot as plt

print("Quiz 2: Number 3")
print("================================")

# dw/dt function
def dwdt(t, w):
    return 1000 - 3*w

# create empty array to store each step's values
x = [0, 0.4, 0.8]
y = [0]

# runge kutta 2nd order function
def rungeKutta(t0, w0, t_final, h):
    # Count number of iterations using step size
    n = round((t_final - t0) / h);
    # Iterate for number of iterations
    w = w0;
    for i in range(1, n + 1):
        # Apply Runge Kutta Formulas to find next value of w
        k1 = h * dwdt(t0, w);
        k2 = h * dwdt(t0 + 0.5 * h, w + 0.5 * k1);

        # Update next value of w and add it to array y
        w = w + (1.0 / 6.0) * (k1 + 2 * k2);
        y.append(w)
        # Update next value of t
        t0 = t0 + h;

    return w;

# 2nd Order Runge kutta approximation
ans = rungeKutta(0, 0, 0.8, 0.4)
print("2nd Order Runge kutta approximation is =", ans);

exact_value = 303.09
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
plt.title("Runge Kutta 2nd Order")

ax = fig.add_subplot(1, 1, 1)
ax.scatter(plot_x, plot_y)
plt.xlabel("Time/s")
plt.ylabel("W/(rad/s)")
ax.plot(plot_x, plot_y)
plt.show()