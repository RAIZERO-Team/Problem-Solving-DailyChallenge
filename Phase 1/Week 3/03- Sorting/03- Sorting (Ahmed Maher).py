# Author : Ahmed Maher

N = int(input())
A = list(map(int, input().split()))

for i in range(len(A)):
    minIndx = i
    for j in range(i + 1 , len(A)):
        if A[j] < A[minIndx]:
            minIndx = j
    A[i], A[minIndx] = A[minIndx], A[i]

print(" ".join(map(str, A)))