input = input()
num = ['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
sec = 0
for i in range(len(input)):
    for j in num:
        if input[i] in j:
            sec += num.index(j) + 3
print(sec)