N = int(input())
count = 0

while 1:
    if N % 5 != 0:
        N = N - 3
        count = count + 1
    elif N < 0:
        print(-1)
        break
    elif N % 5 == 0:
        count = count + (N // 5)
        print(count)
        break
