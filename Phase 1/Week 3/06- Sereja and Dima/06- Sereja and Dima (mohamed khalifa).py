size = int(input())
cards = list(map(int , input().split()))
sereja  , dima = 0 , 0
for i in range(size):
    if i % 2 == 0 :
         sereja += max(cards[0], cards[-1])
         cards.remove(max(cards[0], cards[-1])) 
    else : 
         dima  += max(cards[0], cards[-1])
         cards.remove(max(cards[0], cards[-1])) 

print(sereja , dima)