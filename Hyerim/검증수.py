num = list(map(int, input().split()))
total = 0
for i in range(len(num)):
    total += num[i]**2
key = total % 10
print(key)
