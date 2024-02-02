# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AYcllbDqUVgDFASR

case = int(input())
for num in range(1,case+1) :
    N=int(input())
    result = [(i,j) for i in range(-N,N+1) for j in range(-N,N+1) if (i**2 + j**2)<=N**2 ]
    print(f'#{num} {len(result)}')