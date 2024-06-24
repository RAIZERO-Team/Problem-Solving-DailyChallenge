# Author : Ahmed Maher

A, B, C , D = map(int, input().split())

A %= 100
B %= 100
C %= 100
D %= 100

result = (A * B * C * D) %100

print(f"{result:02d}")
