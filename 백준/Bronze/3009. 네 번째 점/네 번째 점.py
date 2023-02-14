import sys

x_l = list()
y_l = list()
for _ in range(3):
    x, y = map(int, sys.stdin.readline().split())
    x_l.append(x)
    y_l.append(y)

for x in x_l:
    if x_l.count(x) == 1:
        print(x, end=" ")
        break
for y in y_l:
    if y_l.count(y) == 1:
        print(y)
        break
