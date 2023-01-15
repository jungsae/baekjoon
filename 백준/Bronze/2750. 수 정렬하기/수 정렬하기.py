def sort(arr):
    arrL = len(arr)
    for _ in range(arrL - 1):
        for j in range(arrL - 1):
            if arr[j] > arr[j + 1]:
                temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
        arrL -= 1
    for i in range(len(arr)):
        print(numList[i])


N = int(input())
numList = []
for _ in range(N):
    num = int(input())
    numList.append(num)
sort(numList)
