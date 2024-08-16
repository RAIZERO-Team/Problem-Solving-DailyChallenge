# Author: Ahmed Maher

n = int(input().strip())
count = 0

for i in range(n):
    x, z = map(int, input().strip().split())
    if z - x >= 2:
        count += 1

print(count)