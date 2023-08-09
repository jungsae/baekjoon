import sys

N = int(sys.stdin.readline())

stack = []

for _ in range(N):
    num = int(sys.stdin.readline())
    if num == 0:
        stack.pop()
    else:
        stack.append(num)

print(sum(stack))
