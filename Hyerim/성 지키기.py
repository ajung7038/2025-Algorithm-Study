row, col = map(int, input().split())
row_count, col_count = 0, 0
castle = []
for i in range(row):
    castle.append(input())
    if 'X' not in castle[i]:
        row_count += 1
for j in range(col):
    for i in range(row):
        if castle[i][j] == 'X':
            break
    else:
        col_count += 1
print(max(row_count, col_count))
