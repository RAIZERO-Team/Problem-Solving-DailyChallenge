# Moataz Abdelraouf

import math 
R, S = map(int, input().split())

diagonal_circle = R * 2
diagonal_square = math.sqrt(2)* S

if diagonal_circle >= diagonal_square:
    print("Circle")
elif diagonal_circle <= S:
    print("Square")
else:
    print("Complex")