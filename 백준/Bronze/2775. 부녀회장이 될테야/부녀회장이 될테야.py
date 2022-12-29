T = int(input())

for _ in range(T):
    k = int(input())
    n = int(input())

    apart = [room for room in range(1, n + 1)]

    for lv in range(k):
        for rm in range(len(apart) - 1):
            apart[rm + 1] = apart[rm] + apart[rm + 1]

    print(apart[-1])
