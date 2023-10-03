#3-4
print("Question 3-4")
list_invitation = ["Gardyan","Bagus","Mario"]
for people in list_invitation:
    #print("Dear "+list_invitation[i]+" please come to dinner")
    print("Dear "+people+" please come to dinner")
print(" ")

#3-5
print("Question 3-5")
print("Mario cannot make it to dinner")
list_invitation.remove("Mario")
list_invitation.insert(2,"Rafael")
for people in list_invitation:
    print("Dear "+people+" please come to dinner")
print(" ")

#3-6
print("Question 3-6")
print("Guys I found a new table!")
list_invitation.insert(0, "Jocelyn")
list_invitation.insert(2, "Nicolas")
list_invitation.append("Jason")
for people in list_invitation:
    print("Dear "+people+" please come to dinner")
print(" ")

#3-7
print("Question 3-7")
print("Bad news, only 2 people can come to dinner")
newlist_invitation = ["Gardyan","Bagus","Jocelyn", "Jason","Nicholas","Rafael"]
removed = []
for i in range(4):
    # print("Sorry "+newlist_invitation.pop(i)+"'s invitation is cancelled")
    removed.append(newlist_invitation.pop())
for removedpeople in removed:
    print("Sorry "+removedpeople+" you are no longer invited to dinner")
for invited in newlist_invitation:
    print("Dear "+invited+" you are still invited to dinner")
print(" ")

#3-8
print("Question 3-8")
location_unsorted = ["Japan", "Australia", "Korea", "New Zealand", "Russia"]#1
print(location_unsorted)#2
location_sorted = sorted(location_unsorted)#3
print(location_sorted)
print(location_unsorted)#4
location_sorted = sorted(location_unsorted,reverse=True)#5
print(location_sorted)
print(location_unsorted)#6
location_unsorted.reverse()#7
print(location_unsorted)
location_unsorted.reverse()#8
print(location_unsorted)
location_unsorted.sort()#9
print(location_unsorted)
location_unsorted.reverse()#10
print(location_unsorted)
