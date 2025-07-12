N = int(input())
num = list(map(int, input().split()))
M = max(num)
mean = (sum(num)/len(num))/M*100
print(mean)
