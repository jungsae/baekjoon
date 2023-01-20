N = input()
temp = []
for i in str(N):
    temp.append(i)
temp.sort(reverse=True)
a = "".join(temp)
print(int(a))
