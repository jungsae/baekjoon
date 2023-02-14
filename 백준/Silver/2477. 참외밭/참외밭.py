import sys


# lst_x = []
# lst_y = []

k = int(sys.stdin.readline())
# for _ in range(6):
#     x, y = map(int, sys.stdin.readline().split())
#     if x in (1, 2):
#         lst_x.append(y)
#     else:
#         lst_y.append(y)

# lst_x.sort(reverse=True)
# lst_y.sort(reverse=True)

# print(k, lst_x, lst_y, end="\n")

# print(((lst_x[0] * lst_y[0]) - (lst_x[2] * lst_y[2])) * k)
arr = []
large = 0
small = 0
idx = 0
for _ in range(6):
    x, y = map(int, sys.stdin.readline().split())
    arr.append(y)

for i in range(6):
    if large < arr[i] * arr[(i + 1) % 6]:
        large = arr[i] * arr[(i + 1) % 6]
        idx = i

small = arr[(idx + 3) % 6] * arr[(idx + 4) % 6]
print(k * (large - small))
