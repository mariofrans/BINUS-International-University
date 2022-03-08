import math

def f(x):
  #return 1 - math.exp(-0.24*x)
  return 1 - math.exp(-0.12*x)

def forward_diff(x,dx):
  df = (f(x+dx)-f(x))/dx
  return df

def central_diff(x,dx):
  df = (f(x+dx)-f(x-dx))/(2*dx)
  return df

print("Number 1a:")
exact = 0.23431
estimation = forward_diff(0.1,0.05)
print("f'(0.1) =", estimation)
print("Absolute relative true error =", abs(100*(exact-estimation)/exact))

print("Number 1b:")
exact = 0.11856
estimation = central_diff(0.1,0.05)
print("f'(0.1) =", estimation)
print("Absolute relative true error =", abs(100*(exact-estimation)/exact))

# Commented out IPython magic to ensure Python compatibility.
from matplotlib import pyplot as plt
# %matplotlib inline

def f(x,y):
  return 37.5 - 3.5*y

# n: number of steps
# x,y: (x0,y0)
def euler(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt-x)/n
  for i in range(0,n):
    x = x + h
    y = y + f(x,y)*h
    xi.append(x)
    yi.append(y)
  return xi,yi

x  = 0  # in the problem t = x or initial t
y  = 50 # in the problem x = y or initial x
# solve dx/dt -> dy/dx
xt = 3
n  = 2 # n = (xt-x0)/h => (3-0)/1.5 = 2

xi,ye = euler(x,y,xt,n)
print("Number 2:")
print("Salt concentration after 3 mins =",ye[n])

# Commented out IPython magic to ensure Python compatibility.
from matplotlib import pyplot as plt
# %matplotlib inline

def f(x,y):
  return 1000 - 3*y

# n: number of steps
# x,y: (x0,y0)
def heun(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt-x)/n
  for i in range(0,n):
    k1 = f(x,y)
    k2 = f(x+h,y+k1*h)
    y = y + (k1+k2)*h/2
    xi.append(x+(i+1)*h)
    yi.append(y)
  return xi,yi

x  = 0 # in the problem t = x
y  = 0 # in the problem w = y
# solve dw/dt -> dy/dx
xt = 0.8
n  = 2 # n = (xt-x0)/h => (0.8-0)/0.4 = 2

xi,ye = heun(x,y,xt,n)
print("Number 3:")
print("Salt concentration after 3 mins =",ye[n])

# Commented out IPython magic to ensure Python compatibility.
from matplotlib import pyplot as plt
# %matplotlib inline

def f(x,y):
  return -0.06*y

# n: number of steps
# x,y: (x0,y0)

def runge_kutta4(x,y,xt,n):
  xi = []
  yi = []
  xi.append(x)
  yi.append(y)
  h = (xt-x)/n
  for i in range(0,n):
    k1 = f(x,y)
    k2 = f(x+h/2,y+k1*h/2)
    k3 = f(x+h/2,y+k2*h/2)
    k4 = f(x+h,y+k3*h)
    y = y + (k1+2*k2+2*k3+k4)*h/6
    xi.append(x+(i+1)*h)
    yi.append(y)
  return xi,yi

x  = 0      # in the problem t = x
y  = 10**7  # in the problem C = y
# Solve dC/dt -> dy/dx
xt = 7
n  = 2 # n = (xt-x0)/h => (7-0)/3.5 = 2

xi,yr4 = runge_kutta4(x,y,xt,n)
print("Number 4: ")
print("Polution concentration at t = 7 is", yr4[n])
