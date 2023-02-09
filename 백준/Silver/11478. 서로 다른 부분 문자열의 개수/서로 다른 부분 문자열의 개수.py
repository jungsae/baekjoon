import sys


s = sys.stdin.readline().rstrip()
words = set()
for i in range(len(s)):
    for j in range(i, len(s)):
        words.add(s[i : j + 1])
print(len(words))
