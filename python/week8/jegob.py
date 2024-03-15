# https://www.acmicpc.net/problem/1016
import math

min_n, max_n = map(int,input().split())

ls = [ True for _ in range(min_n,max_n+1)]
ans = max_n-min_n+1

for i in range(2,int(math.sqrt(max_n))+1) : 
    a = min_n // i**2
    if min_n % i**2 != 0 :
        a += 1
    
    while a*(i**2) <= max_n : 
        if ls[a*(i**2) - min_n] :
            ls[a*(i**2) - min_n ]= False
            ans-=1
        a+=1

print(ans)

