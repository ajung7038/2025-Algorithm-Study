count = int(input())
xy = []
for i in range(count):
    x, y = map(int, input().split())
    xy.append((x, y))
    i += 1
xy.sort()
for x, y in xy:
    print(x, y)
