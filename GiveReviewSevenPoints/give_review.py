def give_review(reviewList):
    productDict = {}
    counterDict = {}
    result_list = []
    
    for i in range(len(reviewList)):
        productId = reviewList[i][0]
        unformattedStar = reviewList[i][1].split("/")
        productStar = unformattedStar[0]
        
        if (productId in productDict):
            productDict[productId] = productDict.get(productId) + int(productStar)
            counterDict[productId] = counterDict.get(productId) + 1
        else:   
            productDict[productId] = int(productStar)
            counterDict[productId] = 1
        
    for key in productDict:
        sub_result = []
        sub_result.append(key)
        average = round(productDict[key]/counterDict[key])
        sub_result.append(str(average) + "/5")
        result_list.append(sub_result)
    
    result_list.sort()
    return result_list