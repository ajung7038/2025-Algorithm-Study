from collections import deque
N = int(input())
paper = list(map(int, input().split()))
lst = []
balloon = deque()
for i in range(N):
    balloon.append((i+1, paper[i]))
while True:
    index, num = balloon.popleft()
    lst.append(index)
    if not balloon:
        break
    if num > 0:
        balloon.rotate(-(num-1))
    else:
        balloon.rotate(-num)

for i in lst:
    print(i, end=' ')
