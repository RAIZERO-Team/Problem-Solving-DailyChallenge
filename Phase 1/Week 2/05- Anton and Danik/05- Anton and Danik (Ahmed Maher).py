# Author: Ahmed Maher

n = int(input().strip())
s = input().strip()

antonW = s.count('A')
danikW = s.count('D')

if antonW > danikW:
    print("Anton")
elif danikW > antonW:
    print("Danik")
else:
    print("Friendship")
