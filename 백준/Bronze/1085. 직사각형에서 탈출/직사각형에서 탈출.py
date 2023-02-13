import sys


x, y, w, h = map(int, sys.stdin.readline().split())

print(min((w - x), (x - 0), (y - 0), (h - y)))
