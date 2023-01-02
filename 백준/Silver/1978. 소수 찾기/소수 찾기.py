N = int(input())
count = 0
nums = map(int, input().split())
for num in nums:
    check = 0
    for j in range(1, num + 1):
        if num % j == 0:
            check = check + 1
    if check == 2:
        count = count + 1
print(count)
