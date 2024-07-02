# Author Moataz Dahy
N = int(input())
n1 = 0
n2 = 1
count = 0
if N < 0:
    print()
elif N == 0:
    print(n1)
else:
    while count < N:
        print(n1, end=' ')
        next = n1 + n2
        n1 = n2
        n2 = next
        count += 1