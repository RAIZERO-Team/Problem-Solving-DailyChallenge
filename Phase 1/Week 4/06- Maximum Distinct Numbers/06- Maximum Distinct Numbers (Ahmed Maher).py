# Author: Ahmed Maher
N = int(input().strip())
maxNum = sumNum = 0
while sumNum + maxNum + 1 <= N:
    maxNum += 1
    sumNum += maxNum
print(maxNum)