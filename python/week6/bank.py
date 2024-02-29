# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWMeRLz6kC0DFAXd
def flip(s,i,n) :
    ls = [0,1,2]
    if n == 2:
        if s[i] == '0':
            ans = s[:i]+'1'+s[i+1:]
        else :
            ans =  s[:i]+'0'+s[i+1:]
    else :
        ls.pop(int(s[i]))
        ans = []
        for el in ls :
            ans.append(int(s[:i]+str(el)+s[i+1:],3))

    return ans

T = int(input())
for t in range(T):
    a = input()
    b = input()
    ans = 0

    for i in range(len(a)):
        for j in range(len(b)):
            ori_a = int(flip(a,i,2),2)
            ori_b = flip(b,j,3)
            if ori_a in ori_b :
                ans = ori_a
                break
        else:
            continue
        break
    print(f'#{t+1} {ans}')