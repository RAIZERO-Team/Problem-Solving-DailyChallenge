# Author : Moataz Dahy

A, B = map(int, input().split())
 
N = list(map(int, input().split()))


for _ in range(B):
    x = int(input())
    if x in N :
       print("found")
    else :
      print("not found")

