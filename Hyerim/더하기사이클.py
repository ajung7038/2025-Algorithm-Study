num = int(input())
origin = num
count = 0
while True:
    a = num // 10
    b = num % 10
    new = b*10+((a+b) % 10)
    count += 1
    num = new
    if new == origin:
        break
print(count)
