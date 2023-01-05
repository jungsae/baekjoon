N = int(input())
num = N
for i in range(2, N + 1):
    while num % i == 0:
        num = num // i
        print(i)
