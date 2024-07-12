# Author : Ahmed Maher

N, Q = map(int, input().split())
A = list(map(int, input().split()))

dict = {}
for num in A:
    dict[num] = True

for i in range(Q):
    X = int(input())
    if X in dict:
        print("found")
    else:
        print("not found")
