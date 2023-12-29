import sys

N, d, k, c = map(int, sys.stdin.readline().rsplit())
arr = [int(sys.stdin.readline().strip()) for _ in range(N)]
result = 0
sushi_count = {}
l, r = 0, 0

while l != N:
    if r - l < k:
        sushi = arr[r % N]
        sushi_count[sushi] = sushi_count.get(sushi, 0) + 1
        r += 1
    else:
        max_count = len(sushi_count)

        if c not in sushi_count:
            max_count += 1
        result = max(result, max_count)
        sushi = arr[l % N]
        sushi_count[sushi] -= 1

        if sushi_count[sushi] == 0:
            del sushi_count[sushi]
        l += 1
print(result)
