#Number A

# import csv
#
# from datetime import datetime
#
# import pygal
#
# from matplotlib import pyplot as plt
#
# filename = 'activity.csv'
#
# with open(filename) as f:
#     reader = csv.reader(f)
#     header_row = next(reader)
#
#     dates , steps = [] , []
#     current_date=0
#     stepping = 0
#     date = 1
#
#     for row in reader:
#             current_dates = datetime.strptime(row[1], "%Y-%m-%d")
#             if current_dates == current_date:
#                 if row[0] != 'NA':
#                     step = int(row[0])
#                     stepping += step
#
#             else:
#                 current_date = datetime.strptime(row[1], "%Y-%m-%d")
#                 dates.append(date)
#                 steps.append(stepping)
#                 stepping = 0
#                 date += 1
#                 if row[0] != 'NA':
#                     step = int(row[0])
#                     stepping += step
#
#     steps.append(stepping)
#
# mean = sum(steps) // len(dates)
# print("Mean : ",mean)
# sortedSteps = sorted(steps)
# print("Median : ",sortedSteps[31])
# del steps[0]
# del dates[0]
# print(dates)
# print(steps)
#
#
# hist = pygal.Bar()
# hist.add("Steps" , steps)
# hist.render_to_file("histogram.svg")
#
#
#
# #Number B
#
# import csv
#
# from datetime import datetime
#
# import pygal
#
# filename = 'activity.csv'
#
# with open(filename) as f:
#     reader = csv.reader(f)
#     header_row = next(reader)
#
#     dates, steps = [], []
#
#     current_date = 0
#     stepping = 0
#     count = 0
#
#     for row in reader:
#         current_dates = datetime.strptime(row[1], "%Y-%m-%d")
#         if current_dates == current_date:
#             if row[0] != 'NA':
#                 step = int(row[0])
#                 stepping += step
#                 count += 1
#         else:
#             current_date = datetime.strptime(row[1], "%Y-%m-%d")
#             if count != 0:
#                 average = stepping // count
#                 steps.append(average)
#                 stepping = 0
#                 count = 0
#                 if row[0] != 'NA':
#                     step = int(row[0])
#                     stepping += step
#                     count += 1
#
#
#     steps.append(average)
#
# print(steps)
# print(len(steps))
#
# hist = pygal.Bar()
# hist.add("Steps" , steps)
# hist.render_to_file("histogram2.svg")
#
#
#
# #Number C
#
# import csv
#
# from datetime import datetime
#
# import pygal
#
# filename = 'activity.csv'
#
# print("Fill in the missing values(NA) in the Dataset! ")
#
# with open(filename) as f:
#     reader = csv.reader(f)
#     header_row = next(reader)
#     count = 0
#
#     steps = []
#     current_date = 0
#     stepping = 0
#
#     for row in reader:
#         current_dates = datetime.strptime(row[1], "%Y-%m-%d")
#         if current_dates == current_date:
#             if row[0] == 'NA':
#                 interval = row[2]
#                 date = row[1]
#                 print("No Data is Available at interval",interval,"on",date)
#                 new = int(input("Enter the Steps : "))
#                 stepping += new
#                 count += 1
#             else:
#                 stepping += row[0]
#
#         else:
#             current_date = datetime.strptime(row[1], "%Y-%m-%d")
#             steps.append(stepping)
#             stepping = 0
#             if row[0] == 'NA':
#                 interval = row[2]
#                 date = row[1]
#                 print("No Data is Available at interval", interval, "on", date)
#                 new = int(input("Enter the Steps : "))
#                 stepping += new
#                 count += 1
#             else:
#                 stepping += row[0]
#
#     steps.append(stepping)
#
# print(count , "rows with NAs")
# print(steps)
# mean = sum(steps) // len(steps)
# print("Mean : ",mean)
# sortedSteps = sorted(steps)
# x = len(steps) // 2
# print("Median : ",sortedSteps[x])
#
# hist = pygal.Bar()
# hist.add("Steps" , steps)
# hist.render_to_file("histogram3.svg")
#
#
#
# #Number D
#
# import csv
#
# from datetime import datetime
#
# import pygal
#
# filename = 'activity.csv'
#
# with open(filename) as f:
#         reader = csv.reader(f)
#         header_row = next(reader)
#
#         data = {}
#         steps = []
#
#
#         for row in reader:
#
#             row.append("days")
#
#
#             for i in range(9):
#                 for j in range(5):
#                     x = "weekday"
#                     row[3]=x
#                 for k in range(2):
#                     y = "weekend"
#                     row[3]=y
#
#             if row[3] == "weekend":
#                 if row[2] not in data:
#                     data.update({row[2]:0})
#                     for v in data.values():
#                         if row[0] != 'NA':
#                             v += int(row[0])
#                 else:
#                     for p in data.keys():
#                         for v in data.values():
#                             if row[0] != 'NA':
#                                 v += int(row[0])
#
#         for u in data.values():
#             average =int( u / 31 )
#             steps.append(average)
#
# hist = pygal.Bar()
# hist.add("Steps" , steps)
# print(steps)
# hist.render_to_file("histogram4.svg")