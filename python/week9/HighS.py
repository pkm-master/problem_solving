# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV2b7Yf6ABcBBASw

def searchH(i,N,S):
    global ans
    if S >= ans or S+sum(ls[i:]) < B: 
        return 
    if i == N : 
        if ans > S and S >= B: 
            ans = S 
    else :
        for j in range(2) : 
            searchH(i+1,N,S+j*ls[i]) 

T = int(input())
for t in range(T):
    N,B = map(int,input().split())
    ls = list(map(int,input().split()))
    ans = 10000*20
    searchH(0,N,0)

    print(f'#{t+1} {ans-B}')