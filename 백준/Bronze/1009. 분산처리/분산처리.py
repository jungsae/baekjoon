T = int(input())
for _ in range(T):
    a, b = map(int, input().split())
    last = a % 10

    if last == 0:
        print(10)
    elif last in [4, 9]:
        exp = b % 2
        if exp == 0:
            print((last ** 2) % 10)
        else:
            print(last)
    elif last in [1, 5, 6]:
        print(last)
    else:
        exp = b % 4
        if exp == 0:
            print((last ** 4) % 10)
        else:
            print((last ** exp) % 10)