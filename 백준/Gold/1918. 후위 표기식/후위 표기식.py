def getNum(operator):
    if operator in '*/':
        return 2
    elif operator in '+-':
        return 1
    else:
        return -1

def infix_to_postfix(expression):
    stack = []
    output = []
    
    for char in expression:
        if char.isalpha():
            output.append(char)
        elif char == '(':
            stack.append(char)
        elif char == ')':
            while stack and stack[-1] != '(':
                output.append(stack.pop())
            stack.pop()  # '('를 스택에서 제거
        else:  # 연산자인 경우
            while stack and getNum(stack[-1]) >= getNum(char):
                output.append(stack.pop())
            stack.append(char)

    while stack:
        output.append(stack.pop())

    return ''.join(output)

u = input()
result = infix_to_postfix(u)
print(result)