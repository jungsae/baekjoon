import sys

N = int(input())
nums = [0 for _ in range(10001)]
for _ in range(N):
    nums[int(sys.stdin.readline())] += 1
for i in range(len(nums)):
    if nums[i] != 0:
        for j in range(nums[i]):
            print(i)
