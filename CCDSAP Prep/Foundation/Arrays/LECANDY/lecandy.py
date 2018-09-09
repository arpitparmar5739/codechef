T = int(input())

while T:
    _, c = input().split()
    total = sum(map(int, input().split()))
    if total <= int(c):
        print('Yes')
    else:
        print('No')
    T -= 1
