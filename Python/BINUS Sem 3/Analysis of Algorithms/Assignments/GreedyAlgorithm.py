class ItemValue:
    """Item Value DataClass"""

    def __init__(self, wt, val, ind):
        self.wt = wt
        self.val = val
        self.ind = ind
        self.cost = val // wt

    def __lt__(self, other):
        return self.cost < other.cost

    # Greedy Approach


class FractionalKnapSack:
    """Time Complexity O(n log n)"""

    @staticmethod
    def getMaxValue(wt, val, capacity):

        """function to get maximum value """
        iVal = []
        for i in range(len(wt)):
            iVal.append(ItemValue(wt[i], val[i], i))

            # sorting items by value
        iVal.sort(reverse=True)

        totalValue = 0
        for i in iVal:
            curWt = int(i.wt)
            curVal = int(i.val)
            if capacity - curWt >= 0:
                capacity -= curWt
                totalValue += curVal
            else:
                fraction = capacity / curWt
                totalValue += curVal * fraction
                capacity = int(capacity - (curWt * fraction))
                break
        return totalValue

    # Driver Code


if __name__ == "__main__":
    val = [4, 5, 3, 7]
    wt = [2, 3, 1, 4]
    capacity = 5

    maxValue = FractionalKnapSack.getMaxValue(wt, val, capacity)
    print("Maximum value in Knapsack =", maxValue)