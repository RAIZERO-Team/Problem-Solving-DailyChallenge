# Author : Mohamed Khalifa 

def binarySearch(list , target):
    start , end = 0 , len(list)-1
    while start <= end : 
        mid = int((start + end) / 2) 
        if list[mid] == target : 
            return "found"
        elif list[mid] < target :
            start = mid+1
        else : 
            end = mid-1    

    return "not found"
N , Q = map(int , input().split())
li = list(map(int , input().split()))
li.sort()
targets = []
for i in range(Q) : 
    targets.append(int(input()))
for i in targets :
    print(binarySearch(li , i))



