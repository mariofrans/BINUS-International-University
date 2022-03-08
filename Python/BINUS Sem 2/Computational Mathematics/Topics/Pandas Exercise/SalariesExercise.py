import pandas as pd

df = pd.read_csv('salaries.csv')

print(df)

sum_phd = df.phd.sum()
sum_serv = df.service.sum()
sum_salary = df.salary.sum()

print("Sum of phd: ", sum_phd)
print("Sum of service years: ", sum_serv)
print("Sum of salaries: ", sum_salary)
