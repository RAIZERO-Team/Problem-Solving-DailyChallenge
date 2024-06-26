# Author Moataz Dahy
data = input().split()
A = float(data[0])
B = float(data[1])
while (A >= -1000 and A <= 1000) and (B >= -1000 and B <= 10000):
    if A >= 0 and B >= 0:
        if A == 0 and B == 0:
               print("Origem")
        elif A == 0:
               print("Eixo Y")
        elif A > 0.0 and B == 0.0 :
               print("Eixo X")
        else :
               print("Q1")
        break
    elif A <= 0 and B >= 0:
        if A < 0.0 and B == 0.0 :
             print("Eixo X")
        elif A == 0.0 and B > 0.0 :
           print("Eixo Y")
        else : 
             print("Q2")
        break
    elif A <= 0 and B <= 0:
        if A == 0.0 and B < 0.0 :
            print("Eixo Y")
        else :
            print("Q3")
        break
    elif A >= 0 and B <= 0:
      print("Q4")
      break