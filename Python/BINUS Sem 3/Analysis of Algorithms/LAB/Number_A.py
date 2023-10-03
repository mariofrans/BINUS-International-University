
# n = int(input("Please enter the number of rows and columns of a square matrix: "))
# arr = []
#
# # user input
# for i in range(n):
#     temp = []
#     print("Please input the values of row ", i+1, ", one at a time:")
#     for j in range(n):
#         temp.append(int(input()))
#     arr.append(temp)
#
# # display matrix
# # for i in range(n):
# #     for j in range(n):
# #         print(arr[i][j], end=" ")
# #     print()
#
# # calculate diagonals
# left = 0
# right = 0
# for i in range(n):
#     left = left + arr[i][i]
#     right = right + arr[n - 1 - i][i]
#
# # absolute of diagonal difference
# print(abs(left-right))

# amount of rows
n = int(input())
total = 0
for i in range(n):
    # [11, 2, 4]
    temp = input().split()
    total = total + int(temp[i]) - int(temp[n-1-i])
print(abs(total))