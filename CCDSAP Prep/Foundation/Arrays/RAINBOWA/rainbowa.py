T = int(input())

while T > 0:
    rb_len = int(input())
    rainbow = list(map(int, input().split()))

    if (rb_len >= 13):
        start = 0
        end = rb_len - 1
        flag = True

        for i in range(1, 8):
            if rainbow[start] != i:
                flag = False
                break

            while rainbow[start] == i and rainbow[end] == i and start < end:
                start += 1
                end -= 1

        if flag and rainbow[start] == 7 and rainbow[end] == 7:
            print('yes')
        else:
            print('no')
    else:
        print('no')

    T -= 1
