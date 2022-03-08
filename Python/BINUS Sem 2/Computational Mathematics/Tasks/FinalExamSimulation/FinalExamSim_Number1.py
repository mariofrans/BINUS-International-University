from sklearn.linear_model import LinearRegression
import numpy as np

print(" ")
print("Final Exam Simulation Computational Mathematics: Number 1")
print(" ")

# table data
t = np.array([30, 35, 33, 36, 40, 45, 48]).reshape(-1, 1)
h = np.array([1.2, 1.22, 1.24, 1.23, 1.32, 1.35, 1.4])

model = LinearRegression()
model.fit(t, h)

m = float(model.coef_)
c = float(model.intercept_)

print("Y-Intercept: ", c)
print("Gradient: ", m)
print(" ")

print("The equation of line is: ")
print("h = ", m, "* t +", c)

print(" ")
print("The value of 't' when 'h' = 2 is: ", (2 - c)/m)
