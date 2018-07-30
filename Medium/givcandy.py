import math

T = int(input())
while T:
    numbers = list(map(int, input().split(" ")))
    print(abs(numbers[0]-numbers[1]) % (math.gcd(numbers[2], numbers[3])))
    T -= 1
