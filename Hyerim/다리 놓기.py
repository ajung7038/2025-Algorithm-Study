import math
N = int(input())
count = []
for i in range(N):
    west, east = map(int, input().split())
    count.append(math.comb(east, west))
for i in count:
    print(i)
