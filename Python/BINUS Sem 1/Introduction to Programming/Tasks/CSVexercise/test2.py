from csv import reader
from statistics import mean

with open('activity.csv', 'r') as f:
    data = reader(f)
    mydict = {}
    for row in data:
        print(row)
        # if row[0] != 'NA' and  row[1] != 'date':
        #     if row[1] not in mydict:
        #         mydict[row[1]] = [int(row[0])]
        #     else:
        #         mydict[row[1]].append(int(row[0]))

# tot_perday = {}
# mean_tot_perday = {}
# for key, value in mydict.items():
#     tot_perday[key] = sum(value)
#     mean_tot_perday[key] = round(mean(value), 2)
#
# print(tot_perday) # print the total number of steps each day
# print(mean_tot_perday) # print the mean number of steps each day
# print(mydict)
# f.close()
#
# import numpy as np
# import matplotlib.pyplot as plt
#
# N = len(mydict)
# mean_step_perday = tuple(mean_tot_perday.values())
# ind = np.arange(N)     # the x locations for the groups & array from 1 to end
# width = 0.8            # the width of the bars can also be len(x) sequence
#
# p1 = plt.bar(ind, mean_step_perday, width)
# plt.title('Mean Total Steps Per Day')

# to plot the axis values
# plt.xticks(ind, tuple(mean_tot_perday.keys()))
# plt.yticks(np.arange(0, 101, 20))
#
#
# plt.show()

