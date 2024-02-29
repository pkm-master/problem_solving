# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXWXMZta-PsDFAST
from collections import deque
dir = [(0,1),(0,-1),(1,0),(-1,0)]
T = int(input().strip())

for t in range(T):
    N,M = map(int,input().strip().split())
    arr =[input().strip() for _ in range(N)]
    visited = [[-1]*M for _ in range(N)]
    q = deque()
    for i in range(N):
        for j in range(M) :
            if arr[i][j] == 'W':
                visited[i][j] = 0
                q.append([i,j])
            else :
                continue

    while q:
        st = q.popleft()
        for di in dir:
            new_i = st[0] + di[0]
            new_j = st[1] + di[1]
            if 0 <= new_i < N and 0 <= new_j < M and visited[new_i][new_j] == -1 :
                visited[new_i][new_j] = visited[st[0]][st[1]] +1
                q.append([new_i, new_j])
    ans = 0
    for ele in visited:
        ans += sum(ele)

    print(f'#{t+1} {ans}')