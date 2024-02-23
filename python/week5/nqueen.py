# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7GKs06AU0DFAXB&categoryId=AV7GKs06AU0DFAXB&categoryType=CODE&problemTitle=N-Queen&orderBy=FIRST_REG_DATETIME&selectCodeLang=ALL&select-1=&pageSize=10&pageIndex=1

def placeQ(i,N):
    global cnt
    if i == N : 
        cnt+=1
        return
    for j in range(N):
        for k in range(i): 
            if qp[k] == j or abs(qp[k]-j) == abs(k-i): 
                break
        else :
            qp[i] = j 
            placeQ(i+1,N) 

T = int(input())
for t in range(T):
    N = int(input())
    qp = [-1] * N
    cnt = 0
    placeQ(0,N)

    print(f'#{t+1} {cnt}')

