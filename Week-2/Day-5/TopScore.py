import unittest
def sort_scores(s, h_score):
    
    count = {}

    for x in s:
        s = count.get(x, 0)
        count[x] = s + 1

    sorts = []
    for i in range(h_score + 1):   
        if i in count:
            val =[i]*count[i]
            sorts.extend(val)
    
    sorts.reverse()
    return sorts
