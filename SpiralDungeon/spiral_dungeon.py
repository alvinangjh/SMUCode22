def spiral_dungeon(dungeon):
    if (len(dungeon) == 0):
        return []
    
    rows = len(dungeon)
    cols = len(dungeon[0])
    top = 0
    bottom = rows
    left = 0
    right = cols
    
    # [1, 12, 11, 10]
    # [2, 13, 16, 9]
    # [3, 14, 15, 8]
    # [4, 5,  6,  7]
    
    resultList = [];

    while (top <= bottom and left <= right):
        #top -> bottom
        for i in range(top, bottom):
            resultList.append(dungeon[i][left])
        left += 1
        
        #left -> right
        resultList += dungeon[bottom-1][left:right]
        bottom -= 1
        
        #bottom -> top
        for i in range(bottom-1, top, -1):
            resultList.append(dungeon[i][right-1])
        right -= 1
        
        #right -> left  
        resultList += dungeon[top][right:left-1:-1]
        top += 1
            
    return resultList