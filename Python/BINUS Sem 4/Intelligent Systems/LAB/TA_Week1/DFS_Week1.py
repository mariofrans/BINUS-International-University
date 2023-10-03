
data = [50, 17, 72, 12, 23, 54, 76, 9, 14, 19, 0, 0, 67]

# paramters(array name, number to be searched, starting index+1)
def dfs(arrayName, x, i):
    if i<len(arrayName):
        if arrayName[i-1] == 0:
            return -1
        print("Check", arrayName[i-1])
        if arrayName[i-1] == x:
            return i
        result = dfs(arrayName, x, (i*2))
        if result != -1:
            return result
        result = dfs(arrayName, x, (i*2)+1)
        if result != -1:
            return result
        return -1
    else:
        return -1

dfs(data, 12, 1)
