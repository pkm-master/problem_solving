word = input()
strs = []

for i in range(len(word)):
    for j in range(len(word)):
        if i>0 and i<j:
            str_a = word[:i]
            str_b = word[i:j]
            str_c = word[j:]
            
            str_a = str_a[::-1]
            str_b= str_b[::-1]
            str_c = str_c[::-1]
            
            str_list = [str_a,str_b,str_c]
            new_str = str_list[0]+str_list[1]+str_list[2]
            strs.append(new_str)
                
strs.sort()
print(strs[0])
            