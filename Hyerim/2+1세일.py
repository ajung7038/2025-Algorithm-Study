N = int(input())
lst = []
group_cost = 0
for i in range(N):
    lst.append(int(input()))
lst.sort(reverse=True)
for i in range(0, len(lst), 3):
    group = lst[i:i+3]
    if len(group) == 3:
        group_cost += group[0]+group[1]
    else:
        group_cost += sum(group)
print(group_cost)
