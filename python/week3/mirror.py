#https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AXTC0x16D8EDFASe

case = int(input())
mirror = {'b':'d','d':'b',
          'p':'q','q':'p'}

for test in range(case):

    txt = input()
    result = ''
    for le in txt[::-1] :
        result += mirror[le]

    print(f'#{test+1} {result}')