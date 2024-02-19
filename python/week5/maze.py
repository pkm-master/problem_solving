#https://www.acmicpc.net/problem/2178

dir = [(0,1),(0,-1),(1,0),(-1,0)]

N,M = map(int,input().split())
arr = [list(map(int,list(input().strip()))) for _ in range(N)]
vis = [[0]*M for _ in range(N)]
q = []
ans = 0

st = (0,0)
end = (N-1,M-1)

vis[st[0]][st[1]] = 1
q.append(st)

while q:
    st = q.pop(0)
    for d in dir :
        new_u = st[0] + d[0]
        new_v = st[1] + d[1]
        if 0<=new_u<N and 0<=new_v<M and arr[new_u][new_v] == 1 and vis[new_u][new_v] == 0 :
            q.append((new_u, new_v))
            vis[new_u][new_v] = vis[st[0]][st[1]] + 1

    if st == end :
        ans = vis[st[0]][st[1]]
        break

else :
    ans = 0

print(ans)
