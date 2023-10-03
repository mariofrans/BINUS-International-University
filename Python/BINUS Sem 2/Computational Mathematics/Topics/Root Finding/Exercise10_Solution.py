def f(x):
  return -26 + 85*x - 91*x**2 + 44*x**3 - 8*x**4 + x**5

def df(x): # derivative of f(x)
  return 85 - 182*x + 132*x**2 - 32*x**3 + 5*x**4

# xl = x lower
# xu = x upper
# es = relative approximation error tolerance

def bisection(xl,xu,es):
  xm_prev = 0
  while True:
    xm = (xl+xu)/2
    ea = abs(100*(xm - xm_prev)/xm)
    xm_prev = xm
    if(f(xl)*f(xm)<0):
      xu = xm
    if(f(xl)*f(xm)>0):
      xl = xm
    if(ea<es or f(xl)*f(xm)==0):
      break
  return xm

def newton_raphson(xi,es):
  while True:
    xi_new = xi - f(xi)/df(xi)
    ea = abs(100*(xi_new - xi)/xi_new)
    xi = xi_new
    if(ea<es):
      break
  return xi_new

print("root:",bisection(0.5,1,10))
print("root:",newton_raphson(0.5, 10))