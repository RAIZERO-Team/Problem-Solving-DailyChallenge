# Author : Mohamed Khalifa 

string = input()
uppercase_letters = sum(1 for i in string if i.isupper())   
lowercase_letters = sum(1 for i in string if i.islower())  
print(string.upper() if uppercase_letters > lowercase_letters else string.lower())