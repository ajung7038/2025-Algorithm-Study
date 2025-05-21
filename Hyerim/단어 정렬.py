N = int(input())
lst = []
for i in range(N):
    lst.append(str(input()))
words = list(set(lst))
words.sort()
words.sort(key=len)
for i in words:
    print(i)
