# ABO Raswhan

N = int(input())

sum = 0

for i in range(N):
  A, B = map(int, input().split())
  
  if B - A >= 2:
    sum += 1
  
print(sum)
