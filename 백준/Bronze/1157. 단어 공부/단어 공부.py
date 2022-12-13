input = input().upper()
alpha_set = list(set(input))
tempArr = []

for i in alpha_set:
    count = input.count(i)
    tempArr.append(count)

if tempArr.count(max(tempArr)) >= 2 :
    print("?")
else:
    print(alpha_set[tempArr.index(max(tempArr))])