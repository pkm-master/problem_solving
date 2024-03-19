# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV7I5fgqEogDFAXB

def make_num(i,st_i,st_j,ch) :
    if i == 6 :
        ls.add(ch)
    else :
        for j in range(4):
            if 0<=st_i+dir[j][0]<4 and 0<=st_j+dir[j][1]<4 :
                make_num(i+1,st_i+dir[j][0], st_j+dir[j][1],ch+arr[st_i+dir[j][0]][st_j+dir[j][1]])

dir = [(0,1),(1,0),(-1,0),(0,-1)]
T = int(input())
for t in range(T):
    ls = set()
    arr = [input().split() for _ in range(4)]
    for i in range(4):
        for j in range(4):
            make_num(0,i,j,arr[i][j])

    print(f'#{t+1} {len(ls)}')