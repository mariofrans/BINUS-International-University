# import numpy as np
# from matplotlib import pyplot as plt
# %matplotlib inline
#
# def lin_reg(x,y):
#     n = len(x)
#     sx  = 0 # sigma x
#     sx2 = 0 # sigma x^2
#     sy  = 0 # sigma y
#     sxy = 0 # sigma xy
#
#     for i in range(0,n):
#         sx  = sx  + x[i]
#         sx2 = sx2 + x[i]**2
#         sy  = sy  + y[i]
#         sxy = sxy + x[i]*y[i]
#
#     mx = sx/n # average of x
#     my = sy/n # average of y
#
#     a1 = (n*sxy - sx*sy)/(n*sx2 - sx**2)
#     a0 = (sx2*sy - sx*sxy)/(n*sx2 - sx**2)
#     # a0 = my - a1*mx
#     return a0,a1
#
# def reg_line(a0,a1,x):
#     yh = []
#     n = len(x)
#     for i in range(0,n):
#         yh.append(a0 + a1*x[i]) # line equation y = a0 + a1.x
#     return yh
#
# # from ppt
# #x = [0.698132,0.959931,1.134464,1.570796,1.919862]
# #y = [0.188224,0.209138,0.230052,0.250965,0.313707]
#
# #covid data from March 18 until April 2
# #x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]
# #y = [227,311,369,450,514,579,686,790,893,1046,1155,1285,1414,1528,1677,1790]
#
# #x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,
# #     29,30,31,32]
# #y = [2,2,2,2,4,4,6,19,27,34,34,69,96,117,134,172,227,311,369,450,514,579,
# #     686,790,893,1046,1155,1285,1414,1528,1677,1790]
# x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14]
# y = [579,686,790,893,1046,1155,1285,1414,1528,1677,1790,1986,2092,2273]
# yh = []
#
# a0, a1 = lin_reg(x,y)
# print(a0,a1)
# yh = reg_line(a0,a1,x)
# plt.plot(x,y,'.')
# plt.plot(x,yh)
# plt.show()
#
# #problem a
# d_1 = 399.56043956043953 + 15*129.52527472527473
# d_2 = 399.56043956043953 + 16*129.52527472527473
# d_3 = 399.56043956043953 + 17*129.52527472527473
# print(d_1,d_2,d_3)
#
# res_sq = 0
# for i in range(0,14):
#   res_sq = res_sq + (y[i] - yh[i])**2
#
# print(res_sq)
#
#
#
#
#
# from matplotlib import pyplot as plt
# % matplotlib
# inline
# import numpy as np
#
#
# def gauss_elm(a, b):
#     n = len(b)
#     # Elimination Phase
#     for k in range(0, n - 1):
#         for i in range(k + 1, n):
#             if a[i][k] != 0.0:
#                 lam = a[i][k] / a[k][k]
#                 for j in range(k + 1, n):
#                     a[i][j] = a[i][j] - lam * a[k][j]
#                 b[i] = b[i] - lam * b[k]
#
#     # Back substitution
#     for k in range(n - 1, -1, -1):
#         b[k] = (b[k] - np.dot(a[k][k + 1:n], b[k + 1:n])) / a[k][k]
#     return b
#
#
# def nonlin_reg(x, y, m):
#     n = len(x)
#     sx = []
#     sxy = []
#     sx_e = [[None for row in range(m + 1)] for col in range(m + 1)]
#     sxy_e = []
#
#     # calculate n,sigma x, sigma x^2, sigma x^3, ... , sigma x^2m
#     # sx[0] = n, sx[1] = sigma x, sx[2] = sigma x^2, ..., s[m] = sigma x^2m
#     # print("Sigma x^i")
#     for j in range(0, 2 * m + 1):  # from 0 until 2m
#         if (j == 0):
#             sx.append(n)
#         else:
#             s = 0
#             for i in range(0, n):
#                 s = s + x[i] ** j
#             sx.append(s)
#         # print(j,sx[j])
#     # print("\n")
#
#     # calculate sigma y, sigma x^1.y, sigma x^2.y, ... , sigma x^m.y
#     # sxy[0] = sigma x^0.y, sx[1] = sigma x^1.y, ..., sxy[m] = sigma x^m.y
#     # print("Sigma x^i.y")
#     for j in range(0, m + 1):
#         s = 0
#         for i in range(0, n):
#             s = s + x[i] ** j * y[i]
#         sxy.append(s)
#     # print(j,sxy[j])
#     # print("\n")
#
#     # create system of linear equation
#     # sx^0.a0 + sx^1.a1 + ... + sx^m.am = sx^0.y
#     # sx^1.a0 + sx^2.a1 + ... + sx^m+1.am = sx^1.y
#     # ...
#     # sx^m.a0 + sx^m+1.a1 + ... + sx^2m.am = sx^m.y
#     # the variables i sx_e (left side of eq), the constants is sxy_e (right side of eq)
#     # print("System of linear equation")
#     for i in range(0, m + 1):
#         sxy_e.append(sxy[i])  # right side of eq
#         for j in range(0, m + 1):
#             k = i + j
#             sx_e[j][i] = sx[k]  # left side of eq
#             # print(j,i,sx_e[j][i],sxy_e[i])
#     return sx_e, sxy_e
#
#
# def reg_curve(a, m, x):
#     yh = []
#     n = len(x)
#     # yh = a0 + a1.x + a2.x^2 + ... + am.x^m
#     for i in range(0, n):
#         s = 0
#         for j in range(0, m + 1):
#             s = s + a[j] * x[i] ** j
#         yh.append(s)
#     return yh
#
#
# # x = [80,40,-40,-120,-200,-280,-340]
# # y = [6.47E-6,6.24E-6,5.72E-6,5.09E-6,4.30E-6,3.33E-6,2.45E-6]
#
# # covid data
# p = 17
# av = 14
# x = range(1, p + 1)
# y = []
# for i in range(0, p): y.append(None)
#
# # ya = [2,2,2,2,4,4,6,19,27,34,34,69,96,117,134,172,227,311,369,450,514,579,
# #      686,790,893,1046,1155,1285,1414,1528,1677,1790,1986]
#
# ya = [579, 686, 790, 893, 1046, 1155, 1285, 1414, 1528, 1677, 1790, 1986, 2092, 2273]
#
# for j in range(0, av):
#     y[j] = ya[j]
#
# print(len(y))
# yh = []
# z = []
# c = []
# order = 8
# z, c = nonlin_reg(x[0:14], y[0:14], order)
# a = gauss_elm(z, c)
# print(a)
# yh = reg_curve(a, order, x)
# plt.plot(x, y, '.')
# plt.plot(x, yh)
# plt.show()
# print(yh[14], yh[15], yh[16])