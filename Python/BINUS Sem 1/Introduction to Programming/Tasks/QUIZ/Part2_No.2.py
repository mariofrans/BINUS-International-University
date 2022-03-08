# NUMBER 2

# initial contents of 'data.txt' file:
# ID, Name, Position, Salary
# 1, Mario, Staff, 5000000
# 2, Brenda, Staff, 5500000
# 4, Gardyan, Officer, 9000000
# 5, Bagus, Manager, 15000000
# 6, Garry, Staff, 4000000
# 7, Judith, Staff, 5000000
# 8, Yuli, Staff, 4500000
# 9, James, Staff, 3500000
# 10, Jason, Officer, 8000000

# a
filename = 'data.txt'
data = open(filename, 'r')

# b
for row in data:
    print(row)

# c
print("")
print("1. New Staff")
print("2. Delete Staff")
print("3. View Summary Data")
print("4. Save & Exit")
print("")

choice = int(input("Input: "))

# d
def newStaff():
    print(" ")
    id = input("Please enter new staff ID:")
    name = input("Please enter new staff name:")
    positon = input("Please enter new staff position:")
    salary = input("Please enter the new staff salary:")
    print(id +", "+name+", "+ positon+", "+ salary)

if choice == 1:
    newStaff()

# e
def deleteStaff():
    print(" ")
    id = input("Please enter staff ID to be deleted:")
    for row in data and id != (id, "", "", ""):
        print(row)

if choice == 2:
    deleteStaff()

# f
sum_Staffsalary = 0
staff_count = 0
sum_Managersalary = 0
manager_count = 0
sum_Officersalary = 0
officer_count = 0

def summary():
    for row in data:
        print(row)
        if ("", "", "Staff", ""):
            staff_count = staff_count + 1
            sum_Staffsalary = sum_Staffsalary + row[3]
            avgStaffSalary = sum_Staffsalary/
            print(avgStaffSalary)
        if ("", "", "Manager", ""):
            manager_count = manager_count + 1
            sum_Managersalary = sum_Managersalary + row[3]
            avgManagerSalary = sum_Managersalary / manager_count
            print(avgManagerSalary)
        if ("", "", "Officer", ""):
            officer_count = officer_count + 1
            sum_Officersalary = sum_Officersalary + row[3]
            avgOfficerSalary = sum_Officersalary / officer_count
            print(avgOfficerSalary)

if choice == 3:
    summary()

# g
if choice == 4:
    data.close()


