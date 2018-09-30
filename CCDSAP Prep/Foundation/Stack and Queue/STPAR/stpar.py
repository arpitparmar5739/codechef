n = int(input())

while n > 0:
    trucks = list(map(int, input().split()))
    side_street = []
    latest_truck = 1

    for i in range(n):
        while len(side_street) > 0 and side_street[len(side_street)-1] == latest_truck:
            side_street.pop()
            latest_truck += 1

        if (trucks[i] == latest_truck):
            latest_truck += 1
        elif len(side_street) == 0 or side_street[len(side_street)-1] > trucks[i]:
            side_street.append(trucks[i])
        else:
            print('no')
            break
    else:
        print('yes')

    n = int(input())
