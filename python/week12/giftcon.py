# https://www.acmicpc.net/problem/17420

from math import ceil

N = int(input())
lefts = list(map(int,input().split()))
plans = list(map(int,input().split()))

ans = 0

h = [(0,0)]*N
max_val = {}
for i in range(N):
    h[i] = [lefts[i],plans[i]]

h.sort(key= lambda x:x[1])

if h[0][1]>h[0][0]:
    ans += ceil((h[0][1] - h[0][0])/30)
    h[0][0] += 30*(ceil((h[0][1] - h[0][0])/30))

max_val[h[0][1]] = h[0][0]
before_day = h[0][1]

for i in range(N) : 

    if i == 0:
        continue
    
    if h[i-1][1] != h[i][1] :
        before_day = h[i-1][1]
    
    if before_day == h[i][1] :
        wanted = h[i][1]
    else:
        wanted = max(max_val[before_day],h[i][1])

    if h[i][0] < wanted : 
        ans += ceil((wanted - h[i][0])/30)
        h[i][0] += 30*(ceil((wanted - h[i][0])/30))
        
    if max_val.get(h[i][1]) == None or max_val[h[i][1]] < h[i][0]:
        max_val[h[i][1]] = h[i][0]
        
print(ans)