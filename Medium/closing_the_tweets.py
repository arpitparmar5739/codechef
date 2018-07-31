N, K = [int(x) for x in input().split(" ")]
open_tweets = set()

while K:
    data = input().split(" ")
    if data[0] == "CLICK":
        if data[1] in open_tweets:
            open_tweets.remove(data[1])
        else:
            open_tweets.add(data[1])
    else:
        open_tweets.clear()
    
    print(len(open_tweets))
    K -= 1
