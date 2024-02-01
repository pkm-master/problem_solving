#https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5PobmqAPoDFAUq

case = int(input())
for test in range(1,case+1):
    N = int(input())

    arr = [ [ 0 for _ in range(N)] for _ in range(N)]

    dir = [(0,1),(1,0),(0,-1),(-1,0)]
    ele_list = [num for num in range(1,N**2+1)]

    u = 0
    v = 0
    arr[u][v] = ele_list.pop(0)

    while ele_list != []:
        for di in dir :
            while ele_list != [] and  0<=u + di[0]<N and 0<=v + di[1]<N and arr[u + di[0]][v + di[1]] == 0 :
                    u += di[0]
                    v += di[1]
                    ele = ele_list.pop(0)
                    arr[u][v] = ele

    print(f'#{test}')
    for i in arr:
        print(*i)

