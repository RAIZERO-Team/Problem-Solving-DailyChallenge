# Author : Moataz Dahy 
A, B, C = map(int, input().split())
 
numbers = [A, B, C]
 
if A <= B and A <= C:
    min = A
    if B <= C:
        mid = B
        max = C
    else:
        mid = C
        max = B
elif B <= A and B <= C:
    min = B
    if A <= C:
        mid = A
        max = C
    else:
        mid = C
        max = A
else:
    min = C
    if A <= B:
        mid = A
        max = B
    else:
        mid = B
        max = A
 
print(min)
print(mid)
print(max)
 
print()
 
print(numbers[0])
print(numbers[1])
print(numbers[2])