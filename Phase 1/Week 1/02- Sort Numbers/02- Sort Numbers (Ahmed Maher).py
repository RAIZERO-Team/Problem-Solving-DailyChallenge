# Author : Ahmed Maher

A, B, C = map(int, input().split())

if A >= B and A >= C  and B >= C :
    print(f"{C}\n{B}\n{A}\n")
elif A >= B and A >= C  and B <= C :
    print(f"{B}\n{C}\n{A}\n")
elif B >= A and B >= C  and A >= C :
    print(f"{C}\n{A}\n{B}\n")
elif B >= A and B >= C  and A <= C :
    print(f"{A}\n{C}\n{B}\n")
elif C >= A  and C >= B  and A >= B :
    print(f"{B}\n{A}\n{C}\n")
elif C >= A and C >= B  and A <= B :
    print(f"{A}\n{B}\n{C}\n")

print(f"{A}\n{B}\n{C}")

# another solution

X = [A, B, C]

X.sort()

print(f"{X[0]}\n{X[1]}\n{X[2]}")

print(f"\n{A}\n{B}\n{C}")
