N = int(input())
room = []
width, height = 0, 0
for i in range(N):
    room.append(input())
for i in range(N):
    count = 0
    for j in range(N):
        if room[i][j] == '.':
            count += 1
        else:
            if count >= 2:
                width += 1
            count = 0
    if count >= 2:
        width += 1
for j in range(N):
    count = 0
    for i in range(N):
        if room[i][j] == '.':
            count += 1
        else:
            if count >= 2:
                height += 1
            count = 0
    if count >= 2:
        height += 1
print(width, height)
