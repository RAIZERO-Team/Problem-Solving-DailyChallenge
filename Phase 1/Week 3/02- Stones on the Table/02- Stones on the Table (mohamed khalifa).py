# Author : mohaemd khalifa
n , colors = int(input()) , input()
ch , counter= colors[0] , 0
for i in  colors[1:] :
    counter += 1 if i == ch else 0
    ch = i 
    
print(counter)
    

    
