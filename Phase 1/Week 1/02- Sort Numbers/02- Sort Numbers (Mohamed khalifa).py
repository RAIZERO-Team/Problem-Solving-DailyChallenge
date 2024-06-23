# Author: Mohamed khalifa
a , b , c  = map(int , input().split())
list = [a , b , c]

if a > b :
    a , b = b , a 
if b > c :
    b , c = c ,b 
if a > b :
    a , b = b ,a           

print(a)
print(b)
print(c)

print()

print(list[0])
print(list[1])
print(list[2])







        