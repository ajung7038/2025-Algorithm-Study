N = int(input())
number = 0
title = 666
while True:
    if '666' in str(title):
        number += 1
        if N == number:
            break
    title += 1
print(title)
