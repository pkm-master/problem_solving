# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5V4A46AdIDFAWu

def selBee(i,n,s,h_a,h_b) :
    global max_sum
    if h_a > C or h_b > C:
        return

    if i == n :
        if max_sum < s :
            max_sum = s

    else :
        for j in range(2):
            for k in range(2) :
                selBee(i+1,n,s+k*(b_ls[i]**2)+j*(a_ls[i]**2),h_a+a_ls[i]*j,h_b+b_ls[i]*k)

T = int(input())
for t in range(T):
    N,M,C = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(N)]
    max_sum = 0

    for i in range(N):
        for j in range(N-M+1) :
            a_ls = arr[i][j:j+M]
            for u in range(i,N):
                for v in range(N-M+1):
                    b_ls = arr[u][v:v+M]
                    if u>i or v>=j+M:
                        selBee(0,M,0,0,0)

    print(f'#{t+1} {max_sum}')