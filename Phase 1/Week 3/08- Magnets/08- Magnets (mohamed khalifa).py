# Author : Mohamed Khalifa 

n = int(input())
num_of_groups = 1 
magnets = input()
divOrCon = magnets[1]
for i in range(n-1) :
    magnets = input()
    num_of_groups += 1 if magnets[0] == divOrCon else 0 
    divOrCon = magnets[1]      

print(num_of_groups)   
    
