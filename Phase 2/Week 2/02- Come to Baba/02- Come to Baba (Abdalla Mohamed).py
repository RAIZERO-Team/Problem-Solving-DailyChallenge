# Author : Abdalla Mohamed
import math as ma
N = float(input().strip())
r = 2 * ma.sqrt(N/ 3.14)
Area_of_sq = 0.5 * (r * r)
result = N - Area_of_sq
print(f"{result:.3f}")