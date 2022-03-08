import matplotlib.pyplot as plt
import numpy as np
from sklearn.linear_model import LinearRegression

print(" ")
print("Mid-Exam Computational Mathematics: Problem 1")
print(" ")

print("Problem 1a ==================================================")
# ask user to input the number of units sold, the fixed cost of the business,
# and the cost of materials for each cloth

# number of units sold
n = int(input("Please enter the number of clothes sold: "))
# fixed cost
y = int(input("Please enter the fixed cost of the business: "))
# variable cost
x = int(input("Please enter the cost of materials for each cloth: "))

# clothes sold for 1.5x
price_CheapClothes = (1.5)*x
# clothes sold for 2x
price_ExpensiveClothes = 2*x

# calculate total revenue
revenue = (n/2)*price_CheapClothes + (n/2)*price_ExpensiveClothes
print("1. The total revenue of the business is: Rp.", revenue)

# calculate total cost
total_cost = n*x + y
print("2. The total cost of the business is: Rp.", total_cost)

print(" ")

print("Description of solution: ")
print("First I asked the user to enter the number of clothes sold, ")
print("the startup fixed cost (Y) of the business, and the")
print("variable cost of materials for each cloth(X)")
print("Using the number of clothes sold during the business period,")
print("I calculated the revenue of the business by multiplying both the")
print("selling price of the non-modified clothes (1.5X), and the selling")
print("price of the modified clothes (2X) each by the half the number of units")
print("sold. Then, I add them up and got the total revenue of the business")
print("This is because half of the clothes can be sold at 1.5 times and the")
print("other half can be sold at 2 times cost of materials for each cloth")
print("Next, I calculated for the total cost of the business. This is")
print("done by multiplying the number of units sold and the cost of materials")
print("for each cloth (as the costs of production for each clothes are the same)")
print("and adding them with the startup/fixed cost of the business.")
print("This gives the total cost of the business.")
print("=============================================================")
print(" ")

print("Problem 1b ==================================================")

# calculate the break even quantity of products to be sold
# break even quantity starts from 0
BE_Qty = 0
# check if this break even quantity is less than, larger than or equal to the total cost of the business
while (BE_Qty >= 0):
    if ((BE_Qty/2)*(price_ExpensiveClothes + price_CheapClothes) >= (BE_Qty*x + y)):
        print("The number of clothes the business has to sell to break even is: ", BE_Qty)
        if ((BE_Qty/2)*(price_ExpensiveClothes + price_CheapClothes) == (BE_Qty*x + y)):
            print("Therefore, the minimum number of clothes to be sold to secure a profit is: ", 1+BE_Qty)
        elif ((BE_Qty/2)*(price_ExpensiveClothes + price_CheapClothes) > (BE_Qty*x + y)):
            print("Therefore, the minimum number of clothes to be sold to secure a profit is: ", BE_Qty)
        break
    BE_Qty += 1

if(BE_Qty > n):
    print("You have not break even on the business as you only sold ", n, " clothes")
elif(BE_Qty == n):
    print("You have exactly break even on the business as you sold ", n, " clothes")
elif(BE_Qty < n):
    print("You passed the break even point on the business and are now making profit as you sold ", n, " clothes")

print("=============================================================")
print(" ")

print("Problem 1c ==================================================")
model = LinearRegression()
# quantity of units sold
units = np.array([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]).reshape(-1, 1)
# total cost data
totalCost_data = np.array([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]).reshape(-1, 1)
# total revenue data
totalRevenue_data = np.array([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]).reshape(-1, 1)
# variable cost data
variableCost_data = np.array([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]).reshape(-1, 1)
# profit_data
profit_data = np.array([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]).reshape(-1, 1)

model.fit(totalCost_data, totalRevenue_data)

# add the predictions to each of the data list:
for i in range(20):
    totalCost_data[i] = i*x + y
    totalRevenue_data[i] = (i/2)*price_CheapClothes + (i/2)*price_ExpensiveClothes
    variableCost_data[i] = i*x
    profit_data[i] = ((i/2)*price_CheapClothes + (i/2)*price_ExpensiveClothes) - (i*x + y)


# create graph of the data
plt.style.use('ggplot')
fig = plt.figure("Christensen Mario Frans"); plt.clf()

print("Legends of the graph: ")
print("Blue Line: Total Cost")
print("Orange Line: Total Revenue")
print("Black Line: Total Variable Cost")
print("Purple Line: Total Profit")

plt.title("Legends of the lines are printed in the console")
ax = fig.add_subplot(1, 1, 1)
plt.xlabel("Units sold")
plt.ylabel("Financials/Rupiah")
ax.plot(units, totalRevenue_data)
ax.plot(units, totalCost_data)
ax.plot(units, profit_data)
ax.plot(units, variableCost_data)
plt.show()

print("=============================================================")
print(" ")

# print("Problem 1d ===================================================")








