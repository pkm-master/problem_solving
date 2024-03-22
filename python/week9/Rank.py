# https://school.programmers.co.kr/learn/courses/30/lessons/49191

def solution(n, results):
    winners = [set() for _ in range(n+1)]
    losers = [set() for _ in range(n+1)]
    answer = 0
    
    for el in results : 
        winners[el[1]].add(el[0])
        losers[el[0]].add(el[1])
    
    for i in range(n+1) : 
        for el in winners[i] :
            losers[el] = losers[el].union(losers[i])
        
        for el in losers[i] : 
            winners[el] = winners[el].union(winners[i])
        
    for i in range(n+1) : 
        if len(losers[i]) + len(winners[i]) == n-1 :
            answer+=1

    return answer

