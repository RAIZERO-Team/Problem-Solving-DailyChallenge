# author : mohamed khalifa
a ,  b = map(int , input().split())
code = input()
boolean = True 
# is_valid = len(code) == 1 + a + b and code[a] == '-' and code.replace('-', '').isdigit()
if code[a] == '-' and len(code) == 1+a+b:
    for i in range(len(code)) :
        if (i != a and not ('0' <= code[i] <= '9')) :
            boolean = False
            break
else : boolean = False        


print("Yes" if boolean else "No")















