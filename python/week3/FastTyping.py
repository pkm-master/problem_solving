# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV_65wkqsb4DFAWS

case = int(input())
for test in range(case):
    A,B = tuple(input().split())
    cnt = 0
    i = 0

    while i < len(A)-len(B)+1:
        if i+len(B) < len(A)+1 and B == A[i:i+len(B)] :
            cnt += 1
            i += len(B)-1
        i+=1

    result = len(A) - (len(B)*cnt) +cnt

    print(f'#{test+1} {result}')