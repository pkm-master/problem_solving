# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWngfZVa9XwDFAQU

from collections import deque

T = int(input())
for t in range(T):
    N,M = map(int,input().split())
    arr = [set() for _ in range(N+1)]
    visited = [True] + [False] * N

    for _ in range(M):
        i,j = map(int,input().split())
        arr[i].add(j)
        arr[j].add(i)

    i = 1
    ans = 0

    while False in visited :
        if visited[i] :
            i += 1
        else :
            ans += 1
            q = deque()
            q.append(i)
            visited[i] = True
            while q :
                idx = q.popleft()
                for el in arr[idx] :
                    if not visited[el] :
                        q.append(el)
                        visited[el] = True

    print(f'#{t+1} {ans}')