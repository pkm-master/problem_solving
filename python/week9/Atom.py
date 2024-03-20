# https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWXRFInKex8DFAUo
from collections import deque
 
dir = [(0,1),(0,-1),(-1,0),(1,0)]
 
T = int(input())
 
for t in range(T):
    N = int(input())
    atoms = [0]*N
    E = 0
 
    for i in range(N) :
        x,y,di,K = map(int,input().split())
        atoms[i] = [x,y,di,K]
 
    while atoms :
        dellist = []
        tmp_dict = {}
        for i in range(len(atoms)) :
            atoms[i][0] += dir[atoms[i][2]][0] * 0.5
            atoms[i][1] += dir[atoms[i][2]][1]*0.5
            if 1001<atoms[i][0] or atoms[i][0]<-1001 or atoms[i][1]<-1001 or 1001<atoms[i][1]:
                dellist.append(i)
            elif tmp_dict.get((atoms[i][0],atoms[i][1])):
                tmp_dict.get((atoms[i][0],atoms[i][1])).append(i)
            else :
                tmp_dict.setdefault((atoms[i][0],atoms[i][1]),[i])
 
        for key in tmp_dict :
            if len(tmp_dict[key]) >= 2:
                for val in tmp_dict[key] :
                    E += atoms[val][3]
                    dellist.append(val)
 
        dellist.sort(reverse=True)
        for j in dellist:
            atoms.pop(j)
 
    print(f'#{t+1} {E}')