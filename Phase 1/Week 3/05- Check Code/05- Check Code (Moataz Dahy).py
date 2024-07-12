# Author: Moataz Dahy

A, B = map(int, input().split())
S = input().strip()

if len(S) ==  A + B + 1 and S[A] == '-':
    for i in range(len(S)):
      if i != A and not ('0' <= S[i] <= '9'):
        print('No')
        break
    else :
          print('Yes')
else :
    print('No')


   