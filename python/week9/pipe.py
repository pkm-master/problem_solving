# https://www.acmicpc.net/problem/17070


N = int(input())
arr = [list(map(int,input().split())) for _ in range(N)]
adj = [[0,2],
    [1,2],
    [0,1,2]]

DP = [[[0]*3 for _ in range(N)] for _ in range(N)]

for j in range(2,N) :
    if arr[0][j] == 1:
        break
    DP[0][j] = [1,0,0]

if arr[0][2] != 1 and arr[1][1] !=1 and arr[1][2] !=1 :
    DP[1][2] = [0,0,1]

for k in range(2, N):
    if DP[1][2]==[0,0,0] or j<2 or arr[k][2] == 1:
        break
    DP[k][2] = [0,1,0]

for i in range(1,N) :
    for j in range(3,N) :
        if arr[i][j] == 1:
            continue

        if 0<=j-1<N  :
            DP[i][j][0] += (DP[i][j-1][2] + DP[i][j-1][0])
        if 0<=i-1<N :
            DP[i][j][1] += DP[i-1][j][1]+DP[i-1][j][2]
        if 0<=i-1<N and 0<=j-1<N and arr[i-1][j]!=1 and arr[i][j-1]!=1 :
            DP[i][j][2] +=(DP[i-1][j-1][2]+DP[i-1][j-1][1]+DP[i-1][j-1][0])

print(sum(DP[N-1][N-1]))