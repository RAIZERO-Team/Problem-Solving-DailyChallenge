# Author : Ahmed Maher

import math
r, s = map(int, input().split())

sqDiagonal = s * math.sqrt(2)

if sqDiagonal <= 2 * r:
    print("Circle")
elif 2 * r <= s:
    print("Square")
else:
    print("Complex")