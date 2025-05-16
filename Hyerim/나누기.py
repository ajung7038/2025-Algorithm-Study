N = int(input())
F = int(input())
num = N - (N % 100)
for i in range(100):
    if (num+i) % F == 0:
        if i < 10:
            print("0" + str(i))
        else:
            print(i)
        break
