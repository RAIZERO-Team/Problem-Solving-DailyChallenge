# Author : Ahmed Maher

n = int(input())
a = list(map(int, input().split()))

front = 0
back = n - 1

while front <= back:
    print(a[front], end=" ")
    front += 1
    if front <= back:
        print(a[back], end=" ")
        back -= 1