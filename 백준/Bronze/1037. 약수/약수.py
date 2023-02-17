import sys


n = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))
if len(nums) == 1:
    print(nums[0] ** 2)
else:
    print(min(nums) * max(nums))
