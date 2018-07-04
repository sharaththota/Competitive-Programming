import unittest
def contains_cycle(node):

    slow_p = fast_p = node
    while(slow_p and fast_p and fast_p.next):
        slow_p = slow_p.next
        fast_p = fast_p.next.next
        if slow_p == fast_p:
            return True
        
    return False
    


