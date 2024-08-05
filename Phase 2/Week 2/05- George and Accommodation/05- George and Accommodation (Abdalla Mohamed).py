# Author : Abdalla Mohamed
n =int(input())
co=0
for i in range(n): 
    x,y= map(int,input().split())
    if y -x>=2:
        co+=1
print(co)