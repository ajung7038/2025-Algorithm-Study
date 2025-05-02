num1 = int(input())
cards = set(map(int, input().split()))
num2 = int(input())
targets = list(map(int, input().split()))
result = []
for i in targets:
    if i in cards:
        result.append(1)
    else:
        result.append(0)
for j in result:
    print(j, end=' ')
