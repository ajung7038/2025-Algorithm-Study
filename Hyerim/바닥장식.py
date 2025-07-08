N, M = map(int, input().split())
lst = []
for i in range(N):
    lst.append(input())
tile = 0
for i in range(N):
    for j in range(M):
        if lst[i][j] == '-':
            if j == 0 or lst[i][j-1] != '-':
                tile += 1
for j in range(M):
    for i in range(N):
        if lst[i][j] == '|':
            if i == 0 or lst[i-1][j] != '|':
                tile += 1
print(tile)
