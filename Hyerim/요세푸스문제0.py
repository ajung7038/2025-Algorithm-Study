N, k = map(int, input().split())
lst = [i for i in range(1, N+1)]
output = []
index = 0
for i in range(N):
    index = (index+k-1) % len(lst)
    idx = lst.pop(index)
    output.append(idx)
print("<"+", ".join(map(str, output))+">")
