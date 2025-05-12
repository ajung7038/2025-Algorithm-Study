X = int(input())
stick = [64]
while sum(stick) > X:
    small = stick.pop()//2
    if small+sum(stick) >= X:
        stick.append(small)
    else:
        stick.append(small)
        stick.append(small)
print(len(stick))
