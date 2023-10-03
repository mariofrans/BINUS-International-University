# Returns the maximum value that can be put in a knapsack of:
# n = number of items in bag
# W = strength
# wt = weight total (array)
# val = value of items (array)

def knapSack(W, wt, val, n):

	# Base Case
	if n == 0 or W == 0:
		return 0

	# If weight of the nth item is
	# more than Knapsack of capacity W,
	# then this item cannot be included
	# in the optimal solution
	if (wt[n-1] > W):
		return knapSack(W, wt, val, n-1)

	# return the maximum of two cases:
	# (1) nth item included
	# (2) not included
	else:
		maximum = max(
			val[n-1] +
			knapSack(W-wt[n-1], wt, val, n-1),
			knapSack(W, wt, val, n-1)
		)

		return maximum

# driver code

W = int(input("Please input the maximum strength of the knapsack: "))
n = int(input("Please enter the number of items: "))

wt = []
val = []

for i in range(n):
	print("For item number", i+1, ", please enter the following: ")
	wt.append(int(input("Weight of item: ")))
	val.append(int(input("Value of item: ")))

print(knapSack(W, wt, val, n))
