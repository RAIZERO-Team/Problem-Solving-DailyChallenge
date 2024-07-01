#Author Moataz Rashwan

n = int(input())
x = list(map(int,input().split()))

even = 0
odd = 0
positive = 0
negative = 0

for i in x:
  if (i % 2 == 0):
    even += 1
  else:
    odd += 1
    
  if (i > 0 ):
    positive += 1
  elif (i < 0):
    negative += 1

print("Even:",even)
print("Odd:",odd)
print("Positive:",positive)
print("Negative:",negative)