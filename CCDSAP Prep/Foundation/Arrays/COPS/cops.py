T = int(input())

while T > 0:
    M, x, y = map(int, input().split())
    cops = list(map(int, input().split()))
    cops.sort()
    r = x*y
    ans = 0

    if cops[0]-r > 1:
        ans = cops[0]-r-1
    if cops[M-1]+r < 100:
        ans += 100-(cops[M-1]+r)

    for i in range(1, M):
        t1 = cops[i-1] + r
        t2 = cops[i] - r
        if t2 > t1:
            ans += t2-t1-1

    print(ans)
    T -= 1
