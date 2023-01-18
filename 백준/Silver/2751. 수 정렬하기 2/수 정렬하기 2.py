import sys

N = int(input())
nums = []
for i in range(N):
    num = int(sys.stdin.readline())
    nums.append(num)
nums.sort()
for i in nums:
    print(i)
