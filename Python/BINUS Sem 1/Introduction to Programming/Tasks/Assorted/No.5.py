def overlapping(lst1, lst2):
    for a in range(len(lst1)):
        for b in range(len(lst2)):
            if lst1[a] == lst2[b]:
                print("There is a value that is common in the two list")

print(overlapping([1,2,3],[2,3,4]))