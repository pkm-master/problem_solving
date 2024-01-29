#https://www.acmicpc.net/problem/1003
from math import sqrt

def nth_fibonacci(n) :
    alpha = (1+sqrt(5))/2
    beta = (1-sqrt(5))/2
    
    return (alpha**n -beta**n)/(sqrt(5))

Test_case = int(input())

for i in range(Test_case) :
    n = int(input())
    if n == 0 :
        print(1, 0)
    elif n == 1 :
        print(0,1)
    else : 
        count_0 = int(nth_fibonacci(n-1))
        count_1 = int(nth_fibonacci(n))

        print(count_0, count_1)
