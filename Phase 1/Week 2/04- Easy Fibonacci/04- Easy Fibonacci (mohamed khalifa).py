#  Author: mohamed khalifa
N = int(input())

def fibonacci(n):
    a, b = 0, 1
    if n >= 1:
        print(a, end=" ")
    if n >= 2:
        print(b, end=" ")
    for _ in range(2, n):
        a, b = b, a + b
        print(b, end=" ")

fibonacci(N)

    