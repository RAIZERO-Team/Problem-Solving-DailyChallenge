# Author : Moataz
n = int(input())
list_num = [100, 20, 10, 5, 1]

count = 0

for i in list_num:
    if n // i > 0:
        count += n // i
        n = n % i

print(count)
