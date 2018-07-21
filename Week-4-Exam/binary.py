for j in range(6):
    print("enter")
    N=abs(int(input()))
    cnt = 1
    result = 0
    found_one = False
    i = N    
    while i:
        if i & 1 == 1:
            if (found_one == False):
                found_one = True
            else:
                result = max(result,cnt)
            cnt = 0
        else:
            cnt += 1
        i >>= 1
    print(result)
