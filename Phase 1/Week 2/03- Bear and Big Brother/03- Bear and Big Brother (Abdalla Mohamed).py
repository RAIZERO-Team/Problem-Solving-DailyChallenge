a, b = map(int, input().split())
count = 0

while a <= b:
    a *= 3
    b *= 2
    count += 1

if a > b:
    print(count)
