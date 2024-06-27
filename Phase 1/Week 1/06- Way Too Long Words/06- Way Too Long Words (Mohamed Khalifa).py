# Author: Mohamed Khalifa
n = int(input())
words = []
for _ in range(n) :
    words.append(input())
for i in words :
      if len(i) > 10:
        print(f"{i[0]}{len(i) - 2}{i[-1]}")
      else: print(i)  














