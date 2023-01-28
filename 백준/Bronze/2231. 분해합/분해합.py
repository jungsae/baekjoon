import sys


input = int(sys.stdin.readline())
result = 0
for i in range(1, input + 1):
    num = list(map(int, str(i)))
    result = i + sum(num)

    if result == input:
        print(i)
        break

    if i == input:
        print(0)
