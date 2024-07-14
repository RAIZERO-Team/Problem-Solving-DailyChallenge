# Moataz DaHy

size = int(input())

cards = list(map(int, input().split()))

sereja = 0
dima = 0
left = 0
right = size - 1

for i in range(size):
    if i % 2 == 0:
        if cards[left] >= cards[right]:
            sereja += cards[left]
            left += 1
        else:
            sereja += cards[right]
            right -= 1
    else:
        if cards[left] >= cards[right]:
            dima += cards[left]
            left += 1
        else:
            dima += cards[right]
            right -= 1

print(sereja, dima)