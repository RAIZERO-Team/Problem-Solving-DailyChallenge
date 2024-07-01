#Auther : Abdalla Mohamed #
n = int(input())
e = 0
o = 0
pos = 0
neg = 0
for i in range(n):
    x = int(input())
    if x % 2 == 0:
        e += 1
    else:
        o += 1
    if x > 0:
        pos += 1
    elif x < 0:
        neg += 1

# Output the results
print("Even:", e)
print("Odd:", o)
print("Positive:", pos)
print("Negative:", neg)
