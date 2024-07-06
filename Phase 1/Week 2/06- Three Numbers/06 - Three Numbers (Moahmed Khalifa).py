# Author : Moahmed Khalifa

k , s = map(int , input().split())
counter = 0 
for i in range(k+1):
    for j in range(k+1) :
       counter += 1 if (s - i - j) >=0 and (s - i - j) <= k else 0 
             
print(counter)