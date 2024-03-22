# https://school.programmers.co.kr/learn/courses/30/lessons/42897

def solution(money):
    answer = 0
    n = len(money)
    homes1 = [0]*n
    homes2 = [0]*n

    homes1[0] = money[-1]
    homes1[1] = max(homes1[0],money[-1]+money[1])
    homes1[2] = max(homes1[1],money[0]+money[2])
    
    for i in range(3,n-2):
        homes1[i] = max(homes1[i-1],homes1[i-2]+money[i])

    homes2[0] = money[0]
    homes2[1] = max(homes2[0],money[1]) 
    homes2[2] = max(homes2[1],money[0]+money[2])
    
    for i in range(3,n):
        homes2[i] = max(homes2[i-1],homes2[i-2]+money[i])
    
    answer = max(homes1[-3],homes2[-2],homes2[-1]-money[0])
    
    return answer