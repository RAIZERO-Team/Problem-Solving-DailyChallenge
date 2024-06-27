# Author : Ahmed Maher

n = int(input())

for i in range(n):
    st = input()
    if len(st) <= 10:
        print(st)
    else:
        print(f"{st[0]}{len(st) - 2}{st[-1]}")

