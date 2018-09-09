T = int(input())


while T > 0:
    N, K = map(int, input().split())
    minions = map(int, input().split())
    print(sum(True for minion in minions if (minion + K) % 7 == 0))
    T -= 1
