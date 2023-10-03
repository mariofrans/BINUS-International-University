
#main function
def f(x):
    return (40*(x**1.5) + 875*x + 35000)

def df(x): # derivative of f(x)
  return (60*(x**0.5) + 875)

def newton_raphson(xi,es):
  while True:
    xi_new = xi - f(xi)/df(xi)
    ea = abs(100*(xi_new - xi)/xi_new)
    xi = xi_new
    if(ea<es):
      break
  return xi_new

print("Newton Raphson root:", newton_raphson(50, 1))