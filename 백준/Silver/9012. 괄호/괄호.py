import sys

N = int(sys.stdin.readline())

for _ in range(N):
    stack = []
    toggle = True
    line = sys.stdin.readline().rstrip()
    for p in range(len(line)):
        if len(line) % 2 != 0:
            toggle = False
            break
        if line[p] == "(":
            stack.append("*")
        elif line[p] == ")":
            if stack:
                stack.pop()
            else:
                toggle = False
                break
    if toggle and len(stack) == 0:
        print("YES")
    else:
        print("NO")
