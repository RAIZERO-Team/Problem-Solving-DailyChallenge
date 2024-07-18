# Author: Ahmed Maher
S = input().strip().split()
reversedWords = [word[::-1] for word in S]
print(' '.join(reversedWords))