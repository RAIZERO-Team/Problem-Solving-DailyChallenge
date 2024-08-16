# Author: Ahmed Maher

a, b = map(int, input().strip().split())

if a > b:
    a, b = b, a

totalSum = 0
evenSum = 0
oddSum = 0

for i in range(a, b + 1):
    totalSum += i
    if i % 2 == 0:
        evenSum += i
    else:
        oddSum += i

print(totalSum)
print(evenSum)
print(oddSum)
