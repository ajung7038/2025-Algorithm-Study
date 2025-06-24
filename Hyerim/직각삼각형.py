lst = []
while True:
    side = list(map(int, input().split()))
    side.sort()
    x, y, z = side[0], side[1], side[2]
    if (x, y, z) == (0, 0, 0):
        break
    elif (x**2+y**2 == z**2):
        lst.append("right")
    else:
        lst.append("wrong")
print("\n".join(lst))
