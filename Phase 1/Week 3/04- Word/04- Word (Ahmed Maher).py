# Author : Ahmed Maher

s = input().strip()
loCount , upCount = 0 , 0

for char in s:
    if char.islower():
        loCount += 1
    elif char.isupper():
        upCount += 1

if upCount > loCount:
    result = s.upper()
else:
    result = s.lower()

print(result)