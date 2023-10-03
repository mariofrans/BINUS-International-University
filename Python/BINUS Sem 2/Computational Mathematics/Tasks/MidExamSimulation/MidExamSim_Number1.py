print(" ")
print("Exam Simulation Computational Mathematics: Number 1")
print(" ")

fixed_cost = 1500
cost_perScooter = 200
price_perScooter = 300

print("Number 1a ==========================================")

n = int(input("Please enter the number of scooters sold: "))
print("1. The revenue of the business is: $", n*price_perScooter)
print("2. The total cost of the business is: $", n*cost_perScooter + fixed_cost)

print("====================================================")
print(" ")

print("Number 1b ==========================================")
print("First I asked the user to enter the amount of scooters")
print("sold during the business period. This is to calculate")
print("the total revenue and cost of the business. Next, I ")
print("calculate the revenue of the business by multiplying the")
print("units sold by the selling price of each scooter. I also ")
print("calculated the total cost of the business by multiplying")
print("the units sold by the material(cost) of each scooter, ")
print("and adding it with the fixed cost which is $1500.")
print("====================================================")
print(" ")

print("Number 1c ==========================================")

breakEvenQuantity = 0
while (breakEvenQuantity >= 0):
    if (breakEvenQuantity * price_perScooter >= (breakEvenQuantity * cost_perScooter + fixed_cost)):
        print("The number of scooters the business has to sell to break even is: ", breakEvenQuantity)
        if (breakEvenQuantity * price_perScooter == (breakEvenQuantity * cost_perScooter + fixed_cost)):
            print("Therefore, the minimum number of scooters to be sold to secure a profit is: ", 1+breakEvenQuantity)
        elif (breakEvenQuantity * price_perScooter > (breakEvenQuantity * cost_perScooter + fixed_cost)):
            print("Therefore, the minimum number of scooters to be sold to secure a profit is: ",breakEvenQuantity)
        break
    breakEvenQuantity += 1

if(breakEvenQuantity > n):
    print("You have not break even on the business as you only sold ", n, " scooter/s")
elif(breakEvenQuantity == n):
    print("You have exactly break even on the business as you sold ", n, " scooters")
elif(breakEvenQuantity < n):
    print("You passed the break even point on the business and are now making profit as you sold ", n, " scooters")

print("====================================================")

