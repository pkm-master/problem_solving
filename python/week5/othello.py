# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWQmA4uK8ygDFAXj

T = int(input())
for t in range(T):
    N,M = map(int,input().split())
    h = [[0]*N for _ in range(N)]

    for i in range(N//2-1,N//2+1):
        for j in range(N//2-1,N//2+1):
            if i==j:
                h[i][j] = 2
            else :
                h[i][j] = 1

    for _ in range(M):
        j,i,c = map(int,input().split())
        ori_j = j-1
        ori_i = i-1
        h[ori_i][ori_j] = c
        ch = []
        delta=[(1,0),(-1,0),(0,-1),(0,1),(1,1),(-1,-1),(1,-1),(-1,1)]
        num = [0,0]
        for dir in delta :
            i = ori_i
            j = ori_j
            ch = []
            while True:
                i,j = i+dir[0],j+dir[1]

                if 0<=i<N and 0<=j<N:
                    if h[i][j] == 0:
                        break

                    elif h[i][j] != c :
                        ch.append((i,j))

                    elif h[i][j] == c :
                        for ele in ch:
                            h[ele[0]][ele[1]] = c
                        break
                else :
                    break
    for i in range(N) :
        for j in range(N):
            if h[i][j] == 1:
                num[0] += 1
            elif h[i][j] ==2 :
                num[1] +=1


    print(f'#{t+1} {num[0]} {num[1]}')