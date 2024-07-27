# Moataz Dahy

S = int(input())

for i in range(S):
  X = str(input())
  if "010" in X or "101" in X:
    print("Good")
  else :
    print("Bad")