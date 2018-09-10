T = int(input())

while T > 0:
    i = input()
    l = len(i)
    s1 = ''
    s2 = ''
    repeats = []
    ans = 'YES'

    if l % 2 == 0:
        l //= 2
        s1, s2 = i[0:l], i[l:]
    else:
        l //= 2
        s1, s2 = i[0:l], i[l+1:]

    for char in s1:
        if char in repeats:
            continue

        if s1.count(char) == s2.count(char):
            repeats.append(char)
            continue
        else:
            ans = 'NO'

    print(ans)
    T -= 1
