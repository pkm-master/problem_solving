#https://www.acmicpc.net/problem/1052

n,k = list(map(int,input().split()))
needbotle = []
waters = 1

while n > 1:
    if n%2 ==0 :
        n = n/2 
        
    else :
        n = (n-1)/2
        needbotle.append(waters)
    
    waters*=2

needbotle.append(waters)

count = 0
while len(needbotle)>k:
    if needbotle[0]==needbotle[1]:
        pop_val = needbotle.pop(0)
        needbotle[0] = pop_val * 2
        
    else : 
        pop_val = needbotle.pop(0)
        count+= pop_val
        needbotle.insert(0, 2 * pop_val)
    
print(count)
    