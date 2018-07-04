import unittest
def get_closing_paren(sentence, opening_paren_index):
    a=opening_paren_index
    l=len(sentence)
    count=0
    while a<l:
        c=sentence[a]
        if c=="(":
            count+= 1
        elif c== ")":
            count-= 1
            if count == 0:
                return a
        a+= 1
    if count!=0:
        raise Exception


