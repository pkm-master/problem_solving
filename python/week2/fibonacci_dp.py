
def fibo_with_dp(n) : 
    if n==1 or n==2:
        return 1
    
    elif dp_list[n] != 0:
        return dp_list[n]
    
    else : 
        dp_list[n] = fibo_with_dp(n-1) + fibo_with_dp(n-2)
    
    return dp_list[n]

dp_list = [0]*41

Test_case = int(input())

for i in range(Test_case) :
    n = int(input())
    if n == 0 :
        print(1, 0)
    elif n == 1 :
        print(0,1)
    else : 
        count_0 = int(fibo_with_dp(n-1))
        count_1 = int(fibo_with_dp(n))
        print(count_0, count_1)

