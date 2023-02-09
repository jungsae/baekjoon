import sys


n, m = map(int, sys.stdin.readline().split())
set_1 = set(map(int, sys.stdin.readline().split()))
set_2 = set(map(int, sys.stdin.readline().split()))
print(len(set_1 ^ set_2))
