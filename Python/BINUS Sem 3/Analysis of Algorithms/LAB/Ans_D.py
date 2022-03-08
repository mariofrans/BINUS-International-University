x1, v1, x2, v2 = map(int, input().split(" "))

# if both kangaroo starts at the same position
if x1 - x2 == 0: 
    print("YES")        
# if v2 - v1 equals to 0 then they wont ever meet if they start from different position
elif v2 - v1 == 0: 
    print("NO")        
# by using modulus if its divisible by the difference between (v2-v1) then the kangaroos will meet at one point
elif ((x1 - x2) % (v2 - v1) == 0) and (x1 - x2)//(v2-v1) >= 0:
    print("YES")        
else:
    print("NO")
