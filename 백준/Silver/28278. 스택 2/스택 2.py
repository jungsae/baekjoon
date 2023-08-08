import sys

run = int(sys.stdin.readline())
stack = []
for _ in range(run):
    work = sys.stdin.readline().split()
    if work[0] == "1":
        stack.append(work[1])
    elif work[0] == "2":
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif work[0] == "3":
        print(len(stack))
    elif work[0] == "4":
        if stack:
            print(0)
        else:
            print(1)
    elif work[0] == "5":
        if stack:
            print(stack[-1])
        else:
            print(-1)
