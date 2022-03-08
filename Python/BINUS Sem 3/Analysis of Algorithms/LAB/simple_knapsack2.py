# python fancy dictionary
from collections import defaultdict

# take input N W (N = number of items, W = Maximum weight)
N, W = map(int, input().split())

# will be used to store all possible combinations of items taken
dp = defaultdict(int)

# store dummy value so indexing is easier
dp[0] = 0


# loop through items
# runs N times
for _ in range(N):
    # take in items weight and value
    w, v = map(int, input().split())

    # loop through current combinations
    for pw, pv in dp.copy().items():
        # if weight in dict + current weight is smaller than W; items fits / not out of our capacity (W)
        if pw + w <= W:
            # select higher value between old item or new item
            dp[pw + w] = max(dp[pw + w], pv + v)

# out of all combinations of item taken, print the highest one
print(max(dp.values()))