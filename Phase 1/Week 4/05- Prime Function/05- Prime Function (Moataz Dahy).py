'''M O A T A Z _ R A S H W A N'''

import math

def is_prime(number):
    if number < 2:
        return "NO"
    elif number == 2:
        return "YES"
    elif number % 2 == 0:
        return "NO"
    else:
        for i in range(2, int(math.sqrt(number)) + 1):
            if number % i == 0:
                return "NO"
        return "YES"

N = int(input().strip())

for i in range(N):
    number = int(input().strip())
    print(is_prime(number))
