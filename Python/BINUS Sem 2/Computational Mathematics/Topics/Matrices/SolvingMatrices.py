import numpy as np
import pandas as pd
import matplotlib as mpl
import scipy as sp


# writing matrices in python
# a = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])

# inverse matrix
# print(np.linalg.inv(a))

# stacking matrices
# v1 = np.array([1, 3, 5])
# v2 = np.array([2, 5, 1])
# v3 = np.array([2, 3, 8])
# A = np.vstack([v1, v2, v3])

# solving matrix
# A = np.mat('[1 3 5; 2 5 1; 2 3 8]')
# b = np.mat('[10;8;3]')
# print(A)
# print(np.linalg.solve(A,b))

# Exercise1
# using Gauss elimination --> np.linalg.solve(A,b)
# print("Matrix 'A' is: ")
# A = np.mat('[0 0 2 1 2; 0 1 0 2 -1; 1 2 0 -2 0; 0 0 0 -1 1; 0 1 -1 1 -1]')
# print(A)
# print("Matrix 'b' is: ")
# b = np.mat('[1; 1; -4; -2; -1]')
# print(b)
# print("The solution for the above matrices are: ")
# print(np.linalg.solve(A,b))

# Exercise2
# using Gauss Jordan elimination --> A.I*b
# print("Matrix 'A' is: ")
# A = np.mat('[ 2 -3 -1; 3 2 -5; 2 4 -1]')
# print(A)
# print("Matrix 'b' is: ")
# b = np.mat('[3; -9; -5]')
# print(b)
# print("The solution for the above matrices are: ")
# print(A.I*b)

# Exercise3
# L = np.eye(3,3)
#
# print("Matrix 'A' is: ")
# A = np.array([[4,-1,0], [-1,4,-1], [0,-1,4]])
# print(A)
#
# print("Upper of Matrix 'A' is: ")
# #step 1
# A[1] = A[1]-(-(1/4)*A[0])
# #step 2
# A[2] = A[2]-(0*A[0])
# #step 3
# A[2] = A[2]-(-(1/3)*A[1])
# print(A)
#
# print("Lower of Matrix 'A' is: ")
# L[1,0] = -(1/4)
# L[2,0] = 0
# L[2,1] = -(1/3)
# print(L)




