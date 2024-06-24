# Author: Moataz Dahy 

w = int(input())
 
if w >= 1 and w <= 100:
  if  (w %2 == 0 or w % 4 == 0 or w % 6 == 0) and (w != 2):
    print("YES")
 
  else:
    print("NO")