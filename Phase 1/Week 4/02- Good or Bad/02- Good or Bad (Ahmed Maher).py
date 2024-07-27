# Author: Ahmed Maher

T = int(input())

for i in range(T):
    S = input().strip()
    Flag = False
    for i in range( len(S) - 2):
        if (S[i] == '0' and S[i + 1] == '1' and S[i + 2] == '0') or (S[i] == '1' and S[i + 1] == '0' and S[i + 2] == '1'):
            print("Good")
            Flag = True
            break
    if not Flag:
        print("Bad")