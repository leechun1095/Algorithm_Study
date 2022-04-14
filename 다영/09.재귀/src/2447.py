def append_star(n): 
    if n == 1: 
        return ['*'] 
    
    last_n = n//3
    stars = append_star(last_n) 
    
    square = [] 
    for s in stars: 
        square.append(s*3) 

    for s in stars: 
        square.append(s+' '*(last_n)+s) 

    for s in stars: 
        square.append(s*3) 

    return square 

n = int(input()) 
print('\n'.join(append_star(n)))
