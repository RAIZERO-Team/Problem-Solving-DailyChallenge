#Author Moataz Dahy

n = int(input())
values = []
for i in range(n):
    value = input()
    values.append(value)

for value in values:
    if len(value) > 10:
        abbrev = f"{value[0]}{len(value) - 2}{value[-1]}"
        print(abbrev)
    else:
        print(value)