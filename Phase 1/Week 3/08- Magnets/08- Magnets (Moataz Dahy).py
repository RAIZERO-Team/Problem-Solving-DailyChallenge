# MoaTaz DaHy

n = int(input())
magnets = []

for _ in range(n):
    magnets.append(input().strip())

num_group = 1

for i in range(1, n):
    if magnets[i] != magnets[i - 1]:
        num_group += 1

print(num_group)
