import sys


N, M = map(int, sys.stdin.readline().split())
dic = {}
cnt = 0
for _ in range(N):
    word = sys.stdin.readline().strip()
    dic[word] = True
for _ in range(M):
    check = sys.stdin.readline().strip()
    if check in dic:
        cnt += 1
print(cnt)
