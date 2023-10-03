var = "hello"
var_1 = "a"

print(var_1)

# from functools import reduce
# with open('activity.csv', 'r') as file:
#     datas = file.readlines()
#     datas.pop(0)
#     data_per_day:dict = {}
#     for data in datas:
#         if data_per_day.get(data.split(',')[1]) == None:
#             data_per_day[data.split(',')[1]] = []
#         if not data.split(',')[0] == 'NA':
#             data_per_day[data.split(',')[1]].append(data.split(',')[0])
#     for key in data_per_day.keys():
#         if not len(data_per_day[key]) == 0:
#             total_steps = reduce(lamda x,y: x+y,[int(y) for y in data[key]])
#             mean = total_steps/len(data_per_day[key])
#             if len(data_per_day[key])%2 == 0:
#                 pos = int(len(data_per_day[key])/2)
#                 median = (int(data_per_day[key][pos]) + int(data_per_day[key][pos+1])/2
#             else:
#                 median = data_per_day[key][((data_per_day[key]+1)/2)]
#         else:
#                 mean = 'NA';median = 'NA'; total_steps = 'NA'
#
#         print(key)
#         print('Total steps:', str(total_steps))
#         print('Mean:', str(mean))
#         print('Median:', str(median))
#         print(' ')
#
# #number 2
# with open('activity.csv', 'r') as file:
#     datas = file.readlines()
#     datas.pop(0)
#     maximum_average = {'steps':0, 'date1':'', 'date2':''}
#     current_data = {}
#     for data in datas:
#         if not data.split(',')[0] == 'NA'
#             if current_data.get('step') == None;
#                 current_data['step'] = data.split(',')
