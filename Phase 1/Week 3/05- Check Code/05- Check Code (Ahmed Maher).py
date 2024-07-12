# Author : Ahmed Maher

A, B = map(int, input().split())
Str = input().strip()

if len(Str) == A + B + 1 and Str[A] == '-':
    for i in range(len(Str)):
        if i != A and not ('0' <= Str[i] <= '9'):
            print("No")
            break
    else:
        print("Yes")
else:
    print("No")