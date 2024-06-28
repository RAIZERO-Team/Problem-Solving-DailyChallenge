# Author: Mohamed Khalifa
a , b , c , d = map(int , input().split())
a, b, c, d = a % 100, b % 100, c % 100, d % 100
res = (a * b * c * d ) % 100
print(res if res >= 10 else "0%i"  %(res))  