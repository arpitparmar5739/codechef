T = int(input())

while T > 0:
    total_workers = int(input())
    wages = list(map(int, input().split()))
    print(sum(wages)-total_workers*min(wages))
    T -= 1
