# Author : mohamed khalifa

def palindrome(number):
    if number % 2 != 0:
        numBinary = bin(number)[2:]
        return numBinary == numBinary[::-1]
    return False

print("YES" if palindrome(int(input())) else "NO")

        
