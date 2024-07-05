# Author Moataz Dahy

k, S = map(int, input().split())

K = int(k)
S = int(S)

sum = K + S
dif = K - S 

result =((sum - dif) * 2) - 1 

print(result)