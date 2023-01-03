# M, N = map(int, input().split())
M = int(input())
N = int(input())
acc = 0
min = []
for i in range(M, N + 1):
    count = 0
    for j in range(1, i + 1):
        if i % j == 0:
            count = count + 1
    if count == 2:
        acc = acc + i
        min.append(i)
if acc == 0:
    print(-1)
else:
    print(acc)
    print(min[0])
