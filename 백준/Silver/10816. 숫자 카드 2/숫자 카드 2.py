from collections import Counter
import sys

N = int(sys.stdin.readline())
cards = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
nums = list(map(int, sys.stdin.readline().split()))

check = Counter(cards)
for num in nums:
    if num in check:
        print(check[num], end=" ")
    else:
        print(0, end=" ")


# dic = {}
# for num in nums:
#     dic[num] = 0

# for card in cards:
#     if card in dic:
#         dic[card] += 1

# for values in dic.values():
#     print(values, end=" ")
