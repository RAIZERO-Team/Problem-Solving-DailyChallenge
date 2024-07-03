# Author: Ahmed Maher

count = int(input())

x = list(map(int,input().split()))

Even = 0 ; Odd = 0 ;Positive = 0 ; Negative = 0

i = 0
while i < len(x):
    if x[i] % 2 == 0:
        Even += 1
    else:
        Odd += 1

    if x[i] > 0:
        Positive += 1
    elif x[i] < 0:
        Negative += 1
        
    i += 1

print("Even:",Even)
print("Odd:",Odd)
print("Positive:",Positive)
print("Negative:",Negative)
