N = int(input())
point = []
for i in range(N):
    x, y = map(int, input().split())
    point.append((y, x))
point.sort()
for y, x in point:
    print(x, y)
