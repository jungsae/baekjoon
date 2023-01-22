import sys

N = int(sys.stdin.readline())

arr = []

for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    arr.append([y, x])

arr.sort()

for y, x in arr:
    print(x, y)

# acc = N
# for i in range(acc):
#     for j in range(N - 1):
#         if arr[j][1] > arr[j + 1][1]:
#             arr[j], arr[j + 1] = arr[j + 1], arr[j]
#     acc -= 1
#
# for i in range(N):
#     print(arr[i][0], arr[i][1])
