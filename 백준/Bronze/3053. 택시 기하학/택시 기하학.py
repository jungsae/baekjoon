import math
import sys

PI = math.pi

r = int(sys.stdin.readline())
print(round(PI * (r**2), 6))
print(round((r * r) * 2.0, 6))
