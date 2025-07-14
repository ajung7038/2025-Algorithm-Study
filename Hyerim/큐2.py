import sys
from collections import deque
input = sys.stdin.readline
N = int(input())
queue = deque()
output = []
for i in range(N):
    command = input().split()
    cmd = command[0]
    if cmd == 'push':
        queue.append(command[1])
    elif cmd == 'pop':
        if len(queue) == 0:
            output.append(-1)
        else:
            output.append(queue.popleft())
    elif cmd == 'size':
        output.append(len(queue))
    elif cmd == 'empty':
        if len(queue) == 0:
            output.append(1)
        else:
            output.append(0)
    elif cmd == 'front':
        if len(queue) == 0:
            output.append(-1)
        else:
            output.append(queue[0])
    elif cmd == 'back':
        if len(queue) == 0:
            output.append(-1)
        else:
            output.append(queue[-1])
for j in output:
    print(j)
