import sys

n = int(sys.stdin.readline())
arr = list(map(int, sys.stdin.readline().split()))
new_arr = list(set(arr))
new_arr.sort()
dic = {new_arr[i]: i for i in range(len(new_arr))}

for i in arr:
    print(dic[i], end=" ")
