t = int(input())
while t:
    n = int(input())
    nodes = []
    sums = []
    for i in range(n):
        data = input().split(" ")
        nodes.append(int(data[0]))
        sums.append(int(data[1]))
    print(sum(nodes) - sum(sums))
    t -= 1
