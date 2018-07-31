max_value_dict = {i: i for i in range(12)}

def f(coin):
    if coin in max_value_dict:
        return max_value_dict[coin]
    else:
        max_value_dict[coin] = max(coin, (f(coin//2)+f(coin//3)+f(coin//4)))
        return max_value_dict[coin]

while True:
    try:
        coin = int(input())
        print(f(coin))
    except:
        break
