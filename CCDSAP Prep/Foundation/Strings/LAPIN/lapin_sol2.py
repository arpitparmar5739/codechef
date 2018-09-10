T = int(input())

while T > 0:
    i = list(input())
    l = len(i)
    s1 = []
    s2 = []

    if l % 2 == 0:
        l //= 2
        s1, s2 = i[:l], i[l:]
    else:
        l //= 2
        s1, s2 = i[:l], i[l+1:]

    s1.sort()
    s2.sort()

    if s1 == s2:
        print('YES')
    else:
        print('NO')

    T -= 1
