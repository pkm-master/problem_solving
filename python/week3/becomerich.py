#https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc

case = int(input())

for test in range(case):
    N = int(input())
    prices = list(map(int, input().split()))
    benefit = 0

    while prices != [] :
        max_price = max(prices)
        max_idx = prices.index(max_price)
        benefit += sum([max_price-x for x in prices[:max_idx]])

        if max_idx+1 > len(prices):
            break
        prices = prices[(max_idx + 1) : ]

    print(f'#{test+1} {benefit}')