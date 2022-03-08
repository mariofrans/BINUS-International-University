import numpy as np
import pandas as pd
from sklearn.linear_model import LinearRegression

def main():
    print("Artificial Intelligence Transaction Fee Calculator")
    print("==================================================================")

    # user input filename which has the previous data to be used
    filename = str(input("Please input the file name which has previous transaction data/s [amount & fee]: "))

    # read csv file
    file = pd.read_csv(filename)
    print("File content: ")
    print(file)

    # input file data into arrays
    amount = file.Amount
    fee = file.Fee
    output = file.Output

    # convert these array into numpy so that it can be read
    x = np.array(amount).reshape(-1, 1)
    y = np.array(fee)
    z = np.array(output)

    # create linear regression model of these values
    model = LinearRegression()
    model.fit(x, y)

    # calculate and print the y-intercept, gradient, and equation of line with the data collected
    print("==================================================================")
    print("Fixed Fee [y-intercept]: ", float(model.intercept_))
    print("Proportional Fee per Transaction Amount [gradient]: ", float(model.coef_))
    print("Transaction Fee [equation]= ", float(model.coef_), "* (Transaction Amount) +", float(model.intercept_))
    print("==================================================================")

    # input the number of future transactions fee/s to be predicted
    n = int(input("Please enter the number of future transactions fee/s to be predicted: "))

    # create empty array for prediction
    amount_pred = []
    fee_pred = []
    output_pred = []

    # input & predict the transaction amount & fee respectively
    for i in range(n):
        amount_pred.append(float(input("Transaction amount = ")))
        fee_pred.append((model.coef_ * amount_pred[i]) + model.intercept_)
        output_pred.append(amount_pred[i] - fee_pred[i])
    print("==================================================================")

    for i in range(n):
        print("Transaction amount: ", amount_pred[i])
        print("The predicted transaction fee is: ", float(fee_pred[i]))
        print("The predicted cash output is: ", float(output_pred[i]))
    print("==================================================================")

    # combine the previous data and the predicted data
    combine_x = np.concatenate((amount, amount_pred), axis=None)
    combine_y = np.concatenate((fee, fee_pred), axis=None)
    combine_z = np.concatenate((output, output_pred), axis=None)

    # sort the combined arrays
    combine_x.sort()
    combine_y.sort()
    combine_z.sort()

    # combine the 2 arrays into a double array
    df = np.column_stack((combine_x, combine_y, combine_z))
    # print(df)

    # override the csv file data
    np.savetxt(filename, df, fmt='%.2f', delimiter=',', header="Amount,Fee,Output", comments='')

    # show updated file content
    file = pd.read_csv(filename)
    print("Updated file content: ")
    print(file)

    # also automatically update the linear equations using new inputted data

    # input file data into arrays
    amount = file.Amount
    fee = file.Fee
    output = file.Output

    # convert these array into numpy so that it can be read
    x = np.array(amount).reshape(-1, 1)
    y = np.array(fee)
    z = np.array(output)

    # create linear regression model of these values
    model = LinearRegression()
    model.fit(x, y)

    # updated linear equations
    print("==================================================================")
    print("Updated Equations: ")
    print("Fixed Fee [y-intercept]: ", float(model.intercept_))
    print("Proportional Fee per Transaction Amount [gradient]: ", float(model.coef_))
    print("Transaction Fee [equation]= ", float(model.coef_), "* (Transaction Amount) +", float(model.intercept_))
    print("==================================================================")

    # ask user if they want to repeat the program
    print("==================================================================")
    print("Do you want to repeat the program? Please choose an option")
    print("1. Yes")
    print("2. No")
    option = int(input("Input: "))
    print("==================================================================")

    if(option == 1):
        main()
    elif(option == 2):
        print("Thank you for using the program!")

main()


# transactions.csv

# Amount,Fee
# 19.99,1.18
# 29.99,1.62
# 39.98,2.06
# 52.98,2.63

# Amount,Fee,Output
# 19.99,1.18,18.81
# 29.99,1.62,28.37
# 39.98,2.06,37.92
# 52.98,2.63,50.35

# Amount,Fee,Output
# 23.54,1.34,22.20
# 48.54,2.44,46.10
# 68.54,3.32,65.22
# 75.04,3.60,71.44