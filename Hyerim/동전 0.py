N, K = map(int, input().split())
coin = []
for i in range(N):
    coin.append(int(input()))
coin.reverse()
count = 0
for c in coin:
    if c <= K:
        count += K//c
        K %= c
print(count)
