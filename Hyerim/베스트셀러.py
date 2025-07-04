N = int(input())
books = {}
for i in range(N):
    title = input()
    if title in books:
        books[title] += 1
    else:
        books[title] = 1
max_books = max(books.values())
lst = []
for title in books:
    if books[title] == max_books:
        lst.append(title)
lst.sort()
print(lst[0])
