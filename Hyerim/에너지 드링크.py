N = int(input())
lst = list(map(int, input().split()))
lst.sort()
sum = lst[-1]
for i in range(N-1):
    sum += lst[i]/2
print(sum)
