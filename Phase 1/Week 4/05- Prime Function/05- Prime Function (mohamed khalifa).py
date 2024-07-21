# Author : mohamed khalifa

def isPrime(num) : 
    if num == 1 : return False
    for i in range(2 , int(num**0.5)+1) : 
        if num % i == 0 : return False
    return True

for _ in range(int(input())) : 
    print("YES" if isPrime(int(input())) else "NO")    