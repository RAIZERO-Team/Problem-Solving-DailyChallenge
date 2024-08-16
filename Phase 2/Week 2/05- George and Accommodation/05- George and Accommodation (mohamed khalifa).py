# Author : mohamed khalifa
vaild_rooms = 0
for _ in range(int(input())) : 
    p ,q = map(int , input().split())
    vaild_rooms += 1 if q - p >=2 else 0
print(vaild_rooms)    