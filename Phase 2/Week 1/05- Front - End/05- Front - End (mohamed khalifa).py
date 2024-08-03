#  Author : mohamed khalifa
n = int(input())
li = list(map(int , input().split()))
index , front , end  = (0 , 0 , n-1) 
while(index < n) : 
    if index % 2 == 0 : 
        print(li[front] , end=" ")
        front+=1
    else : 
        print(li[end] , end=" ")  
        end-=1
    index+=1    
