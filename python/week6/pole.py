# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXO8QBw6Qu4DFAXS

T = int(input())
for t in range(T):
    N = int(input())
    ans = 0
    lin = []
    for i in range(N):
        a,b = map(int,input().split())
        lin.append((a,b))
    lin.sort(reverse=True)
    for i in range(len(lin)) :
        for el in lin[i+1:]:
            if el[0]<lin[i][0] and el[1] > lin[i][1]:
                ans+=1

    print(f'#{t+1} {ans}')