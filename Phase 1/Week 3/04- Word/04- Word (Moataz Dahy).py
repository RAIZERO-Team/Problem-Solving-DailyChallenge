# Author: Moataz Dahy

s = input().strip()

C_upper = 0 
C_lower = 0 

for i in s:
    if i.islower():
      C_lower += 1
    elif i.isupper():
      C_upper += 1

if C_upper > C_lower:
  print(s.upper())
else :
  print(s.lower())
