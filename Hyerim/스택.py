N = int(input())
stack = []
output = []
for i in range(N):
    command = input().split()
    cmd = command[0]
    if cmd == 'push':
        stack.append(command[1])
    elif cmd == 'pop':
        if len(stack) == 0:
            output.append(-1)
        else:
            output.append(stack[-1])
            stack.pop()
    elif cmd == 'size':
        output.append(len(stack))
    elif cmd == 'empty':
        if len(stack) == 0:
            output.append(1)
        else:
            output.append(0)
    elif cmd == 'top':
        if len(stack) == 0:
            output.append(-1)
        else:
            output.append(stack[-1])
for j in output:
    print(j)
