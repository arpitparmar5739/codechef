N, Q = map(int, input().split())

# HEADS = 1
# TAILS = 0

arr = [0] * N

for i in range(Q):
    K, A, B = list(map(int, input().split()))

    if (K == 0):
        for j in range(A, B+1):
            arr[j] = 1 - arr[j]
    else:
        print(sum(arr[A, B+1]))
