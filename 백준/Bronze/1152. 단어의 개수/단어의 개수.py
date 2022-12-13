input = input()
count = 0
for i,v in enumerate(input):
    if (i == 0 and input[i] == " "):
        continue
    
    if v == " " or i == (len(input) - 1):
        count += 1        
print(count)