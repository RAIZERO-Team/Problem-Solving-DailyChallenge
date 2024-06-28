# Author: Mohamed Khalifa 
n = int(input())
count = 0 
for i in range(n):
    line = input()
    if line[1] == "+" :
        count+=1
    else: 
        count-=1   
print(count)


