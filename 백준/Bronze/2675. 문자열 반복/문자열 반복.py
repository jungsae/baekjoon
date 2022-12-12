T = int(input())
while T > 0:
    T -=1
    R, S = input().split()
    P = ""
    for i in S:
        P += i * int(R)
    print(P)