T = int(input())

while T > 0:
    x, y, k, n = map(int, input().split())
    req_pages = x-y
    result = 'UnluckyChef'
    while n > 0:
        p, c = map(int, input().split())
        if p >= req_pages and c <= k:
            result = 'LuckyChef'
        n -= 1

    print(result)
    T -= 1
