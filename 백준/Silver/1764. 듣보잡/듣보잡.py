import sys

dic = {}
ans = []
cnt = 0
N, M = map(int, sys.stdin.readline().split())
for _ in range(N):
    word = sys.stdin.readline().strip()
    dic[word] = 0

for _ in range(M):
    word = sys.stdin.readline().strip()
    if word in dic:
        cnt += 1
        ans.append(word)
ans.sort(reverse=False)
print(cnt)
for i in ans:
    print(i)
