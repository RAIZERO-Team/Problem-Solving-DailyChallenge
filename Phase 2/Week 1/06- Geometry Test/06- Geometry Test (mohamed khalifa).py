#  Author : mohamed khalifa
import math
R , S = map(int , input().split())
print("Square" if S >= R*2 else "Circle" if R*2 > (math.sqrt(2 * S**2)) else "Complex")

