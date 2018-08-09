input()
F = [0]*30
sum = 0


def totalOnesAtIthLocation(ai):
    for i in range(30):
        if ai & (1 << i):
            F[i] += 1


A = list(map(int, input().split()))

for ai in A:
    totalOnesAtIthLocation(ai)

for i in range(30):
    sum += ((F[i] * (F[i] - 1))//2 * (1 << i))

print(sum)
