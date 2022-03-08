data = [50, 17, 72, 12, 23, 54, 76, 9, 14, 19, 0, 0, 67]


def dfs(data, x, i):
    if i <= len(data):
        if data[i - 1] == 0:
            return -1
        print("Check", data[i - 1])
        if data[i - 1] == x:
            return i
        result = dfs(data, x, (i * 2))
        if result != -1:
            return result
        result = dfs(data, x, (i * 2) + 1)
        if result != -1:
            return result
        return -1
    else:
        return -1


search = dfs(data, 72, 1)
print(search)
