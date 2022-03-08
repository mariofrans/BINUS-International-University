
#main function
def f(x):
    return (40*(x**1.5) + 875*x + 35000)

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

print("Bisection root:", bisection(50, 100, 1))


