A = int(input())
B=A/2
f = False
for i in range(2,int(B)):
    if A % i == 0:
        f = True
        break
if f:
    print("NO")
else:
    print("YES")