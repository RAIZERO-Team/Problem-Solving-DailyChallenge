'''Moataz Dahy'''

N = int(input())

def wonderful(N):
  if (N % 2 != 0 ) and (bin(N)[2:] == bin(N)[2:][::-1]):
    return True
    
if wonderful(N):
    print("YES")
else:
    print("NO")
