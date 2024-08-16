# Author : Ahmed Maher

a, b = map(int, input().split())
result = (a - b) if (a - b) >= 0 else 0
print(result)