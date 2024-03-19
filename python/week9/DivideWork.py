# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LuHfqDz8DFAXc

def search(i,N,p) :
    global max_p

    if p <= max_p :
        return

    if i == N :
        if p  > max_p :
            max_p = p

    else :
        for j in range(N) :
            if j not in path[:i] :
                path[i] = j
                search(i+1,N,p * (arr[i][j]/100))
                path[i] = -1

T = int(input())
for t in range(T):
    N = int(input())
    path = [-1]*N
    arr = [list(map(int,input().split())) for _ in range(N)]
    max_p = 0
    search(0,N,100)
    print(f'#{t+1} {max_p:.6f}')