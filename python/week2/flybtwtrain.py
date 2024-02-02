#https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWajaTmaZw4DFAWM

#### 파리가 10초뒤면 죽는다는 사실을 이용한 경우 
c = int(input())
[print(f'#{i} {v[0]/(v[1]+v[2])*v[3]}') for i in range(1,c+1) for v in [list(map(int,input().split()))]]
# List comprehension에 print구문을 넣어 출력을 돌리는 게 가능할지 확인 하기 위해
# 일부로 가독성이 좋지 않은 코드를 작성

#### 등비급수공식을 이용한 경우
c = int(input())
for i in range(c):
    D,A,B,F = tuple(map(int,input().split()))
    r = F/(F+A+B)
    answer = D * r/(1-r)
    print(f'#{i+1} {answer}')