#미로탐색
#https://www.acmicpc.net/problem/2178

'''

실패한 코드
반례 : 
7 8
11111111
10101010
10000110
00110011
01111111
11111111
11111111

실패 원인
왼쪽 or 오른쪽 우선순위를 부여해서 하나만 처리하게 된다.
이렇게 되면 앞의 반례와 같이, 섞여있는 경우를 제대로 처리하지 못한다.

n,m = tuple(map(int, input().split()))
total_map1 = []
for i in range(n):
    map_line = list(input())
    total_map1.append(map_line)

total_map2 = list(map(list,total_map1))


x=0
y=0

tile1 = 1

while True : 

    if x<m-1 and total_map1[y][x+1]=='1' :
        total_map1[y][x] = '0'
        x+=1
        tile1 +=1 
        
    
    elif y<n-1 and total_map1[y+1][x] =='1' :
        total_map1[y][x] = '0'
        y+=1
        tile1 +=1
        
    
    elif y>0 and total_map1[y-1][x] =='1' :
        total_map1[y][x] = '0'
        y-=1
        tile1 +=1
        
    
    else :
        if total_map1[y][x-1]=='0':
            tile1 = 10000
            break
            
        x-=1
        tile1+=1
        
    
    if (x,y) == (m-1,n-1):
        break


x=0
y=0

tile2 = 1

while True : 

    if y<n-1 and total_map2[y+1][x] =='1' :
        total_map2[y][x] = '0'
        y+=1
        tile2 +=1
        
    elif x<m-1 and total_map2[y][x+1]=='1' :
        total_map2[y][x] = '0'
        x+=1
        tile2 +=1 
    
    
    elif y>0 and total_map2[y-1][x] =='1' :
        total_map2[y][x] = '0'
        y-=1
        tile2 +=1
    
    else :
        if total_map2[y][x-1] == '0':
            tile2 = 10000
            break
        total_map2[y][x] = '0'
        x-=1
        tile2+=1
        
    if (x,y) == (m-1,n-1):
        
        break
    

print(min(tile1,tile2))
'''

#새로운시도
#tree를 만들어서 탐색해보자.

'''
새로운 tree class

(1,1)부터 시작해서 tree에는 각각 right 와 bottom의 line이 존재
갈 수 있는 곳에는 다음 node가 저장된다.
갈 수 없는 곳에는 0이 저장된다.
'''

class tree_node :
    def __init__(self,data):
        self.right = None
        self.bottom = None
        self.data = data #좌표
        
    
root = tree_node(0,0)


'''

해당 방식으로 구현된 tree를 시작지점에서 제일 깊은 곳 까지 가게 했을 때 거친 node의 수를 출력하게 한다.

'''
