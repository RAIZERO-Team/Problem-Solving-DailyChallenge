# Author : MoaTaz DaHy

N = int(input())
A = list(map(int, input().split()))
X = int(input())

location = -1
for i in range(0, len(A)):
    if A[i] == X:
        location = i
        break


print(location)
    