
     # Author: Abdalla Mohamed #

num1 = int(input());num2 = int(input());num3 = int(input())

if num1 > num2 and num1 > num3:
    if num2 > num3:
        print(num3)
        print(num2)
        print(num1)
    else:
        print(num2)
        print(num3)
        print(num1)
elif num2 > num1 and num2 > num3:
    if num1 > num3:
        print(num3)
        print(num1)
        print(num2)
    else:
        print(num1)
        print(num3)
        print(num2)
elif num3 > num1 and num3 > num2:
    if num1 > num2:
        print(num2)
        print(num1)
        print(num3)
    else:
        print(num1)
        print(num2)
        print(num3)

print()
print(num1)
print(num2)
print(num3)
