# https://school.programmers.co.kr/learn/courses/30/lessons/150367

import math

def ior(t,N,ls):
    global cnt
    if t<=(N-1) :
        ior(2*t,N,ls)
        cnt+=1
        ls[t] = cnt
        ior(2*t+1,N,ls)

def solution(numbers):
    global cnt
    answer = []
    for n in numbers:
        bi = ''
        while n :
            bi=str(n%2)+bi
            n = n//2
        if len(bi) == 0:
            N = 0
            answer.append(0)
        else :
            N = 2 ** math.ceil(math.log2(len(bi)+1))
            needzero = N-len(bi)-1
            bi = '0'*needzero + bi

            ls = [0]*N
            cnt = 0
            ior(1, N, ls)
            k=1

            while 2*k+1<N :
                if bi[ls[k]-1]=='0' and (bi[ls[2*k]-1] == '1' or bi[ls[2*k+1]-1]=='1'):
                    answer.append(0)
                    break

                k = k+1
            else :
                answer.append(1)

    return answer
