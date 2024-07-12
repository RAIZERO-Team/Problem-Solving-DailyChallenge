# Author : Moataz Dahy

N = int(input())
A = list(map(int, input().split()))

def selectionsort(A):
    for i in range(len(A)):
        min_index = i
        for j in range(i+1, len(A)):
            if A[j] < A[min_index]:
                min_index = j
        temp = A[i]
        A[i] = A[min_index]
        A[min_index] = temp
    return A

Array_Sorted = selectionsort(A)
for x in Array_Sorted:
    print(x, end=' ')



