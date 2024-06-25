# Author : Ahmed Maher

n = int(input())
count = 0

if n <= 150:
    for i in range(n):
        st = str(input())
        if st == '++X' or st == 'X++':
            count +=1
        elif st == '--X' or st == 'X--':
            count -=1 

print(count)
