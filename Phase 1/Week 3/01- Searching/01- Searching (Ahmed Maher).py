# Author : Ahmed Maher

n , arr , x  = int(input()) , list(map(int , input().split()))  , int(input())
target = -1 
for i in range(0 , len(arr)):
    if arr[i] == x:
        target =  i 
        break

print(target)
