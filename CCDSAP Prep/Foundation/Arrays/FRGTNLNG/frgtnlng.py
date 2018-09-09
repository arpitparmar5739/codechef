T = int(input())

while T > 0:
    N, K = map(int, input().split())
    dictionary = {key: 'NO' for key in input().split()}

    while K > 0:
        phrase = set(input().split()[1:])
        for key in dictionary:
            if (key in phrase):
                dictionary[key] = 'YES'
        K -= 1

    print(' '.join(x for x in dictionary.values()))
    T -= 1
