# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LtJYKDzsDFAXc

dir = [(0,1),(0,-1),(1,0),(-1,0)]

T = int(input())
for t in range(T):
    N = int(input())
    arr = [list(map(int,input().split())) for _ in range(N)]
    ans = 0
    num = 1000

    for i in range(N) :
        for j in range(N) :
            loc_max = 1
            st = (i,j)

            while True :
                for di in dir:
                    new_i = st[0] + di[0]
                    new_j = st[1] + di[1]
                    if 0 <= new_i < N and 0 <= new_j < N and arr[new_i][new_j] - arr[st[0]][st[1]] == 1:
                        loc_max +=1
                        st = (new_i,new_j)
                        break
                else :
                    break

            if ans < loc_max or (ans == loc_max != 0 and num>arr[i][j]):
                ans = loc_max
                num = arr[i][j]

    print(f'#{t+1} {num} {ans}')