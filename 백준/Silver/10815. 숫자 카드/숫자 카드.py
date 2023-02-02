import sys


N = int(sys.stdin.readline())
hand = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
deck = list(map(int, sys.stdin.readline().split()))

dict = {}

for i in range(N):
    dict[hand[i]] = 0

for j in range(M):
    if deck[j] not in dict:
        print(0, end=" ")
    else:
        print(1, end=" ")
