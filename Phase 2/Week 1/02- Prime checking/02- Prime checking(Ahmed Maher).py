# Author : Ahmed Maher



import math

N = int(input())

if N <= 1:
    print("NO")
elif N <= 3:
    print("YES")
elif N % 2 == 0 or N % 3 == 0:
    print("NO")
else:
    for i in range(5, int(math.isqrt(N)) + 1, 6):
        if N % i == 0 or N % (i + 2) == 0:
            print("NO")
            break
    else:
        print("YES")