# Author : Moataz Dahy 

A, B = map(int, input().split())

Result_A = A
Result_B = B

Count_years = 0

while Result_A  <= Result_B :
    Result_A = Result_A * 3
    Result_B = Result_B * 2
    Count_years = Count_years + 1

print(Count_years)