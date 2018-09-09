from collections import defaultdict


def prime_sieve(n):
    sieve = [True] * n
    for i in range(3, int(n ** 0.5) + 1, 2):
        if sieve[i]:
            sieve[i * i::2 * i] = [False] * ((n - i * i - 1) // (2 * i) + 1)
    return [2] + [i for i in range(3, n, 2) if sieve[i]]


print(prime_sieve(100))
# def fws(n):
#     for p in primes:
#         if p*p > n:
#             if n > 1:
#                 d[n] += 1
#             break
#         while not n % p:
#             d[p] += 1
#             n //= p
#
# primes = prime_sieve(1200)
# for t in range(int(input())):
#     n = int(input())
#     A = list(map(int, input().split()))
#     d = defaultdict(int)
#     for N in A:
#         fws(N)
#     ans = 1
#     for x in d.values():
#         ans *= (x+1)
#     print(ans)
