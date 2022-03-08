print(" ")
print("Final Simulation Computational Mathematics: Number 3")
print(" ")

def f(n):
    return 40*(n**2) - 900*n + 36000

def df(n):
    return 80*n - 900

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

print("a)============================================")
print("Bisection method:", bisection(10, 15, 5))
print("==============================================")
print(" ")

print("a)============================================")
print("Newton Raphson method:", newton_raphson(10, 10))
print("==============================================")
print(" ")