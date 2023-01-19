from collections import Counter
import sys

n = int(sys.stdin.readline())
nums = []
mean, median, mode, diff = 0, 0, 0, 0
for _ in range(n):
    nums.append(int(sys.stdin.readline()))
nums.sort()

mean = round((sum(nums) / n))

if n == 1:
    median = nums[0]
else:
    median = nums[n // 2]

num = Counter(nums).most_common()

if n > 1:
    if num[0][1] == num[1][1]:
        mode = num[1][0]
    else:
        mode = num[0][0]
else:
    mode = num[0][0]

diff = max(nums) - min(nums)

print(mean, median, mode, diff, sep="\n")
