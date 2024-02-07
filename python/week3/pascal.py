#https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5P0-h6Ak4DFAUq

case = int(input())
for test in range(case):
    num = 0
    n = int(input())
    pascal = [[0 for _ in range(10)] for _ in range(10)]
    print(f'#{test+1}')
    while num<n:
        pascal[num][0] = 1

        for m in range(num+1):
            if m == 0 or m == num:
                pascal[num][m] = 1
            else:
                pascal[num][m] = pascal[num-1][m-1] + pascal[num-1][m]

        print(*pascal[num][:num+1])
        num += 1

