
# Author :Abdalla Moahmed #
a = int(input())
b = int(input())
c = int(input())
d = int(input())

num1 = a % 100
num2 = b % 100
num3 = c % 100
num4 = d % 100

res = (num1 * num2 * num3 * num4) % 100

if res <= 9:
    print(f"0{res}")
else:
    print(res)
