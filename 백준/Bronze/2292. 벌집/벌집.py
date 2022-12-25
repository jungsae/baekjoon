N = int(input())
acc = 0
result = 0
max = 1

while True:

    if max >= N:
        result += 1
        break

    else:
        acc += 6
        max += acc
        result += 1

print(result)
