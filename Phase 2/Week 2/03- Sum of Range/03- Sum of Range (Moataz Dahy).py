# Author : Moataz Dahy

A, B = map(int, input().split())

if A > B:
    A, B = B, A

Sum = (B - A + 1) * (A + B) // 2
print(Sum)

A_even = A + (A % 2)
B_even = B - (B % 2)
even_sum = ((B_even - A_even) // 2 + 1) * (A_even + B_even) // 2
print(even_sum)

A_odd = A + (1 - A % 2)
B_odd = B - (1 - B % 2)
odd_sum = ((B_odd - A_odd) // 2 + 1) * (A_odd + B_odd) // 2
print(odd_sum)
