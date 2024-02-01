# https://www.acmicpc.net/problem/1105

min_value = 9

L,R = tuple(input().split())

count = 0


if len(L)  == len(R) :
    i = 0
    while L[i] == R[i] :
        if L[i] == '8' and R[i] == '8' :
            count += 1
        if i == len(L)-1:
            break
        i+=1

    print(count)

else : 
    print(0)
    
