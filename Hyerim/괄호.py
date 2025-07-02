T = int(input())
vps = []
for i in range(T):
    count = 0
    ps = input()
    for i in ps:
        if i == '(':
            count += 1
        else:
            count -= 1
        if count < 0:
            vps.append("NO")
            break
    else:
        if count == 0:
            vps.append("YES")
        else:
            vps.append("NO")
for i in vps:
    print(i)
