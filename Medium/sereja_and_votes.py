T = int(input())

while T:
    int(input())
    B = list(map(int, input().split(" ")))

    total = 0
    count = 0

    for item in B:
        if item > 100:
            total = 0
            break

        if item > 0:
            count += 1

        total += item

    if total < 100 or total >= (100+count):
        print("NO")
    else:
        print("YES")

    T -= 1
