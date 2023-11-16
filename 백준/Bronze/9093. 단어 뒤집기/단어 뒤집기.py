T = int(input())

for i in range(T):
    sentence = input().split(' ')
    for sen in sentence:
        print(sen[::-1],sep=' ',end=' ')
    