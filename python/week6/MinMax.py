# https://swexpertacademy.com/main/code/userProblem/userProblemDetail.do?contestProbId=AW8pY_F6j9QDFASf

T = int(input())
for t in range(T):
    N = int(input())
    ls = list(map(int,input().split()))
    
    max_v = 0
    min_v = 100000001
    ans = 'YES'
    
    for i in ls :
        if i > max_v :
            max_v = i
        elif i == max_v :
            ans = 'NO'
            break
        
        if i < min_v :
            min_v = i
        elif i == min_v :
            ans = 'NO'
            break

    print(f'#{t+1} {ans}')