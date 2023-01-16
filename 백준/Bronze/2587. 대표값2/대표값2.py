nums = list()
acc = 0
for i in range(5):
    num = int(input())
    acc = acc + num
    nums.append(num)
nums.sort()
print(acc // 5)
print(nums[2])
