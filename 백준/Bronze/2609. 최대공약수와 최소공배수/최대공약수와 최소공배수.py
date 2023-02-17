import sys


def gcd(num1, num2):
    while num1 != num2:
        if num1 > num2:
            num1 -= num2
        else:
            num2 -= num1
    return num1


num1, num2 = map(int, sys.stdin.readline().split())
result = gcd(num1, num2)
num1 //= result
num2 //= result

print(result, num1 * num2 * result, sep="\n")
