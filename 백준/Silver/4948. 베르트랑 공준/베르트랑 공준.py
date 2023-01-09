MAX = 123456
primeNumList = [True for _ in range((MAX * 2) + 1)]
primeNumList[0] = False
primeNumList[1] = False

for i in range(2, int((MAX * 2) ** 0.5) + 1):
    if primeNumList[i] == True:
        num = 2
        while i * num <= 2 * MAX:
            primeNumList[i * num] = False
            num += 1

while True:
    n = int(input())
    if n == 0:
        break

    cnt = 0

    for i in range(n + 1, (n * 2) + 1):
        if primeNumList[i] == True:
            cnt += 1
    print(cnt)
