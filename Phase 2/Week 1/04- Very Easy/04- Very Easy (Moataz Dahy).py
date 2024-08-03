## Moataz__Dahy ##

N, M = map(int, input().split())

if (-10 ** 9 <= N <= 2 * 10 ** 9) and (-10 ** 9 <= M <= 2 * 10 ** 9):
    print(abs(N + M))