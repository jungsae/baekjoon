T = int(input())

while T > 0:
    T -= 1
    H, W, N = map(int, input().split())
    check = 0

    for rth in range(1, W + 1):
        for lv in range(1, H + 1):
            check += 1

            if check == N:
                if rth < 10:
                    print(str(lv) + "0" + str(rth))
                    break
                else:
                    print(str(lv) + str(rth))
                break
