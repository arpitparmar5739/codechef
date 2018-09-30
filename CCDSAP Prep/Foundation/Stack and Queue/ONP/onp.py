T = int(input())
priority = {"+": 0, "-": 1, "*": 2, "/": 3, "^": 4}

while T > 0:
    top = -1
    expression = input()
    operator_stack = [0]*len(expression)
    rpn = ''

    for char in expression:
        if char.isalpha():
            print(char, end='')
        elif char == ")":
            while operator_stack[top] != "(":
                print(operator_stack[top], end='')
                top -= 1
            top -= 1
        else:
            while not (
                top == -1 or
                char == "(" or
                operator_stack[top] == "(" or
                priority[char] > priority[operator_stack[top]]
            ):
                print(operator_stack[top], end='')
                top -= 1
            top += 1
            operator_stack[top] = char

    while top > -1:
        print(operator_stack[top], end='')
        top -= 1
    print()
    T -= 1
