from ast import Lambda
import sys

arr = []

N = int(sys.stdin.readline())
for i in range(N):
    num, name = sys.stdin.readline().split()
    arr.append([int(num), name])

arr.sort(key=lambda x: int(x[0]))

# for i in range(N):
#     for j in range(N - 1):
#         if arr[j][0] > arr[j + 1][0]:
#             arr[j], arr[j + 1] = arr[j + 1], arr[j]

for i in range(N):
    print(arr[i][0], arr[i][1], sep=" ")
