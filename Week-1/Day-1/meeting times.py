import unittest

from operator import itemgetter 
def merge_ranges(meet):
    if len(meet) <= 1:
        return meet

    meet = sorted(meet, key=itemgetter(0))
    p = [meet[0]]
    for (first, last) in meet:
        (start, end) = p[-1]
        if first <= end:
            if end <= last:
                end = last
            p[-1] = (start, end)
        else:
            p.append((first, last))
    return p




