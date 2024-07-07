# Author : Mohamed Khalifa 
n , arr , x  = int(input()), list(map(int , input().split())) , int(input())
index = next((i for i, val in enumerate(arr) if val == x), -1)
print(index)