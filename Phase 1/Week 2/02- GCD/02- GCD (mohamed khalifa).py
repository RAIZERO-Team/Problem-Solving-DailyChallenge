a , b = map(int , input().split())
min = a if a < b else b

for i in range(min , 0 , -1):
    if a % i == 0 and b % i == 0 :
        print(i)
        break



















