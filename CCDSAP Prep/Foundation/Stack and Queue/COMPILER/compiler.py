T = int(input())

while T:
    expression = input()
    t, ans = 0, 0

    for (index, char) in enumerate(expression):
        if char == "<":
            t += 1
        else:
            t -= 1
            if t == 0:
                ans = index+1
            elif t < 0:
                break

    print(ans)
    T -= 1
