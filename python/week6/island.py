# https://school.programmers.co.kr/learn/courses/30/lessons/42861

def solution(n, costs):
    answer = 0
    connected = set()
    costs.sort(key = lambda x:x[2])
    injp=[{i} for  i in range(n)]
    connected  = [1]+[0]*(n-1)
    while 0 in connected :
        a=costs.pop(0)
        if (not connected[a[0]] or not connected[a[1]]) and a[1] not in injp[a[0]]:
            injp[a[0]]=injp[a[0]].union(injp[a[1]])
            for el in injp[a[0]] :
                injp[el] = injp[a[0]]
            answer += a[2]
            if connected[a[0]]==1:
                for el in injp[a[1]]:
                    connected[el]=1
            elif connected[a[1]]==1:
                for el in injp[a[0]]:
                    connected[el]=1

    return answer

