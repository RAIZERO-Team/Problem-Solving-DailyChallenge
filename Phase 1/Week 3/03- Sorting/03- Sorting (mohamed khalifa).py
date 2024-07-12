# Author : Mohamed Khalifa 

n , arr = int(input()) , list(map(int , input().split()))

# selection sort

for i in range(n) :
    min_index = i  
    for j in range(i+1 , n ) :
       if arr[j] < arr[min_index] :
           min_index = j 
           
    arr[i] , arr[min_index] = arr[min_index] , arr[i]


for i in arr : print(i , end=" ")






