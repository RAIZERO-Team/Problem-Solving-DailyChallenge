""""Moataz 
Dahy"""

import math

N = int(input().strip())

if N < 2:
    print("NO")
elif N == 2:
    print("YES")
else:
    prime = True
    for i in range(2, int(math.sqrt(N)) + 1):
        if N % i == 0:
            prime = False
            break

    if prime:
        print("YES")
    else:
        print("NO")