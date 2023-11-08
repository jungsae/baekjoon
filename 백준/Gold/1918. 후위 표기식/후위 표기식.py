def getNum(operator):
    if operator in '*/':
        return 2
    elif operator in '+-':
        return 1
    else:
        return -1

def infixToPostfix(u):
    stack = []
    output = []

    for i in u:
        if i.isalpha():
            output.append(i)
        
        # i가 ')'면 
        elif i == '(':
            stack.append(i)
            
        elif i == ')':
            # 스택에서 '(' 부분까지 연산자만 다 출력으로 이동
            while stack and stack[-1] != '(':
                output.append(stack.pop())
            stack.pop()            
            
        # 숫자가 아닌 연산자가 들어왔을때
        # 우선순위비교
        else:
            # i 보다 크면 앞쪽 다 출력으로 이동
            while (stack and getNum(stack[-1]) >= getNum(i)):           
                output.append(stack.pop())
            stack.append(i)           

    while stack:
        output.append(stack.pop())
        
    return ''.join(output)

u = input()
result = infixToPostfix(u)
print(result)
