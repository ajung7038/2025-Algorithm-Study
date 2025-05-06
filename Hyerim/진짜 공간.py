import math
num = int(input())
file = list(map(int, input().split()))
cluster = int(input())
file_num = 0
for i in file:
    if i != 0:
        file_num += math.ceil(i / cluster)
    else:
        continue
file_size = cluster*file_num
print(file_size)
