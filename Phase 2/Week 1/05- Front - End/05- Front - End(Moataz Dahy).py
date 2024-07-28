# Moataz Dahy

N = int(input())
array = list(map(int, input().split()))
result = []

while array:
    result.append(array.pop(0))
    if array:
        result.append(array.pop())

print(" ".join(map(str, result)))
