fridge = []

def update():
    print("The items inside the fridge are:")
    print(fridge)
    print(" ")
    print("Please input '1' if you want to store anything in the fridge")
    print("Please input '2' if you want to remove something from the fridge")
    print("Please input '3' if you want to close the fridge")
    print(" ")
    decision = int(input("Input: "))

    if decision == 1:
        store()
    if decision == 2:
        retrieve()
    if decision == 3:
        done()

def store():
    print(" ")
    fridge.append(input("Please enter an item to be stored in the fridge:"))
    print(" ")
    update()

def retrieve():
    print(" ")
    remove_item = (input("Please enter an item to removed from the fridge:"))
    if remove_item in fridge:
        fridge.remove(remove_item)
    else:
        print(" ")
        print("The item you wish to remove is not in the fridge")

    print(" ")
    update()

def done():
    print(" ")
    print("The items inside the fridge are:")
    print(fridge)
    print("Thank You")

update()
