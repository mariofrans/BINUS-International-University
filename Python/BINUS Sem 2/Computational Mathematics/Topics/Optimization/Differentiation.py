from sympy import *

x = Symbol('x')

f = -(x**2) + 8*x - 12
df = f.diff(x)
ddf = df.diff(x)

print(f)
print(df)
print(ddf)

f = lambdify(x, f)
df = lambdify(x, df)
ddf = lambdify(x, ddf)

print(f(4))
print(df(4))
print(ddf(4))