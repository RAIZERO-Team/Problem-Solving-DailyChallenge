# Author : @Moataz_Dahy

n = int(input())
s =  input()

num_index = 0
for i in range(n-1):
  if s[i] == s[i+1]:
    num_index += 1

print(num_index)