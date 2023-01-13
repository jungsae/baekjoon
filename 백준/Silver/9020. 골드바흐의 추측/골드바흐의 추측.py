MAX = 10000
primeNums = [True for _ in range(MAX + 1)]
primeNums[0] = False
primeNums[1] = False

for i in range(2, int(MAX**0.5) + 1):
    if primeNums[i] == True:
        num = 2
        while i * num <= MAX:
            primeNums[i * num] = False
            num += 1

T = int(input())
for _ in range(T):
    n = int(input())
    first = n // 2
    second = first
    check = True
    while check:
        if primeNums[first] == True and primeNums[second] == True:
            check = False
            print(first, second)
        else:
            first -= 1
            second += 1
