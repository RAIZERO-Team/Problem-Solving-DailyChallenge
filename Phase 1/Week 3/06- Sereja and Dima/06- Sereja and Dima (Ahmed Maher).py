# Author : Ahmed Maher

n = int(input())
cards = list(map(int, input().split()))

sereja , dima = 0 , 0
left , right = 0 , n - 1

for turn in range(n):
    if cards[left] > cards[right]:
        chosenCard = cards[left]
        left += 1
    else:
        chosenCard = cards[right]
        right -= 1
    
    if turn % 2 == 0:
        sereja += chosenCard
    else:
        dima += chosenCard
print(sereja, dima)
