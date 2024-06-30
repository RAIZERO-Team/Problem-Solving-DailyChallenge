# Author: mohamed khalifa

size = int(input())
list = list(map(int , input().split()))
positive , negative  , even , odd = 0 , 0 , 0 , 0
for i in list :
    if i > 0 : 
        positive+=1
    elif i < 0 :  
        negative+=1

    if i % 2 == 0 :
        even+=1
    else :
        odd+=1

print(f"Even: {even}")                
print(f"Odd: {odd}")                
print(f"Positive: {positive}")                
print(f"Negative: {negative}")                
   

