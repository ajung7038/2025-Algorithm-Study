from itertools import permutations
t1, t2, t3 = map(int, input().split(":"))
count = 0
for h, m, s in permutations([t1, t2, t3]):
    if 1 <= h <= 12 and 0 <= m <= 59 and 0 <= s <= 59:
        count += 1
print(count)
