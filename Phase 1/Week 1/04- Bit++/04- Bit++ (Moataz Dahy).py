# Author Moataz Dahy
n = int(input())
x = 0
count = 0

while  count < n:
  line = input()
  if line[0] == "+" or line[1] == "+" :
    x += 1
  else:
    x -= 1
  count += 1
  
print(x)