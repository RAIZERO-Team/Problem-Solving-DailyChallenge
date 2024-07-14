# Author: Ahmed Maher

N = int(input().strip())
F, S = 0, 1

if N >= 1:
    print(F, end=" ")
if N >= 2:
    print(S, end=" ")

for i in range(2, N):
    res = F + S
    print(res, end=" ")
    F, S = S, res
