import sys


def gcd(num1, num2):
    while num1 != num2:
        if num1 > num2:
            num1 -= num2
        else:
            num2 -= num1
    return num1


num1, num2 = map(int, sys.stdin.readline().split())
print(gcd(num1, num2), num1 * num2 // gcd(num1, num2), sep="\n")
