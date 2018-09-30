hist = list(map(int, input().split()))

while hist[0] != 0:
    max_area = 0
    top = -1
    stack = [None]*hist[0]
    i = 1
    while i <= hist[0]:
        if top < 0 or hist[i] >= hist[stack[top]]:
            top += 1
            stack[top] = i
        else:
            while top > -1 and hist[i] < hist[stack[top]]:
                tp = stack[top]
                top -= 1
                area = hist[tp] * (i-1 if top < 0 else (i-stack[top]-1))
                if area > max_area:
                    max_area = area
            top += 1
            stack[top] = i
        i += 1

    while top > -1:
        tp = stack[top]
        top -= 1
        area = hist[tp] * (i-1 if top < 0 else i-stack[top]-1)
        if area > max_area:
            max_area = area

    print(max_area)
    hist = list(map(int, input().split()))
