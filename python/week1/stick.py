#https://www.acmicpc.net/problem/1094

stick = [64]
x = int(input())

while sum(stick)!=x:
    min_stick_idx = stick.index(min(stick))
    new_stick = stick.pop(min_stick_idx)/2
    stick.extend([new_stick for _ in range(2)])
    
    if sum(stick)>x:
        alpha = stick.pop()
    
    if sum(stick) <x:
        stick.append(alpha)
    

print(len(stick))

    