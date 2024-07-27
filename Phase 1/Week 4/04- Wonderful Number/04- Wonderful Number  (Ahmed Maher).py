# Author: Ahmed Maher
def wonderful(n):
    return n % 2 != 0 and bin(n)[2:] == bin(n)[2:][::-1]

N = int(input().strip())
print("YES" if wonderful(N) else "NO")