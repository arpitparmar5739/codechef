stack = []
molecule = input().strip()
atomic_weight = {"C": 12, "O": 16, "H": 1}

for (index, char) in enumerate(molecule):
    if char == "(":
        stack.append("(")
    elif char.isalpha():
        stack.append(atomic_weight[char])
    elif char == ")":
        v = 0
        while stack[len(stack)-1] != "(":
            v += stack.pop()
        stack.pop()
        stack.append(v)
    else:
        v = stack.pop()
        v *= int(char)
        stack.append(v)

print(sum(stack))
