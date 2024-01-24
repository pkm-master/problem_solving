#https://www.acmicpc.net/problem/1193

def sum(x): 
    value = 0
    if x == 1:
        return 1
    for num in range(1, x+1):
        value += num
    return value

X = int(input())

line = 1
while sum(line) < X:
    line+=1

if line %2 == 0:
    denominator = sum(line) - X + 1
else :
    denominator = X-sum(line-1)
    
numerator =  line+1 - denominator

print(f'{numerator}/{denominator}')



