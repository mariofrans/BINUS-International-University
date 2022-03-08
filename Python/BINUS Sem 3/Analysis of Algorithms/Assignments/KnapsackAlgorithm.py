# Returns the maximum value that
# can be put in a knapsack of
# capacity = W
# wt = weight total (array)
# val = value of items (array)
# number of items in array (indexes)
def knapSack(W, wt, val, n, items):

	# Base Case
	if n == 0 or W == 0:
		return 0

	# If weight of the nth item is
	# more than Knapsack of capacity W,
	# then this item cannot be included
	# in the optimal solution
	if (wt[n-1] > W):
		return knapSack(W, wt, val, n-1, items)

	# return the maximum of two cases:
	# (1) nth item included
	# (2) not included
	else:
		maximum = max(
			val[n-1] +
			knapSack(W-wt[n-1], wt, val, n-1, items),
			knapSack(W, wt, val, n-1, items)
		)

		return maximum

# driver code
items = ['Apple', 'Orange', 'Banana', 'Melon']
val = [4, 5, 3, 7]
wt = [2, 3, 1, 4]
W = 5
n = len(val)
print(knapSack(W, wt, val, n, items))

