# https://www.acmicpc.net/problem/1527

'''
a,b = map(int,input().split())
cnt = 0
for i in range(a,b+1):
    while i > 0 :
        i,n = divmod(i,10)
        if n not in [4,7] : 
            break
    else : 
        cnt+=1

print(cnt)
''' #a,b사이의 모든 숫자에 대해 숫자가 금민수인지 확인하기->시간초과

#가능한 금민수 목록을 먼저 구한후.
#a,b 사이에 있는 금민수만 세서 출력하도록 알고리즘 변경
a,b = map(int,input().split())
bit = [0]*10
allgum = []
cnt = 0

for k in range(1,10):
    for i in range(1<<k):
        gum = ''
        for j in range(k) :
            if i & 1<<j :
                gum += '4'
            else :
                gum += '7'
        allgum.append(gum)

for ele in allgum:
    if a<=int(ele)<=b :
        cnt +=1

print(cnt)