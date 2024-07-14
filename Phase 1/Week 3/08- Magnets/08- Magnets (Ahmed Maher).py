# Author : Ahmed Maher

n = int(input())
a = str(input())
char1 = a[1]

numOfGroups = 1
for i in range(n-1):
    b = str(input())
    char2 = b[0]
    if char1 == char2:
        numOfGroups += 1
    char1 = b[1]
print(numOfGroups)
