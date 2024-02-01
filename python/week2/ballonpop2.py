# https://swexpertacademy.com/main/code/userProblem/userProblemDetail.do?contestProbId=AYYlGU56XOkDFARc

case = int(input())
for test in range(1, case + 1):
    N, M = tuple(map(int, input().split()))
    arr = [list(map(int, input().split())) for _ in range(N)]
    dir = [(-1, 0), (0, 1), (0, -1), (1, 0)]
    max_flower = 0

    for i in range(1, N):
        for j in range(1, M):
            flower_sum = arr[i][j]
            for di in dir:
                ni = i+di[0]
                nj = j+di[1]
                if 0<=ni<N and 0<=nj<M :
                    flower_sum += arr[ni][nj]
            if max_flower < flower_sum:
                max_flower = flower_sum

    print(f'#{test} {max_flower}')