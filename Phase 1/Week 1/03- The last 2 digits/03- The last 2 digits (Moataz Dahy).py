# Author Moataz Dahy 
A, B, C , D = map(int, input().split())
 
numbers = [A, B, C, D]
 
mult = ((A%100)*(B%100)*(C%100)*(D%100)%100)
 
print(mult) if mult >= 10 else print ("0%i" %(mult))