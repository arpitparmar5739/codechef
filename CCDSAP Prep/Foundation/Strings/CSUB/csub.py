T = int(input())

while T > 0:
    input()
    inp_str = str(input())
    r = inp_str.count('1')
    print(r*(r+1)//2)
    T -= 1
