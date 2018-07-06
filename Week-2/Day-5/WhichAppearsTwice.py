import unittest

def find_repeat(n_list):
    
    if len(n_list) < 2:
        
        raise ValueError('Finding duplicate requires at least two numbers')

    n = len(n_list) - 1
    e_sum= (n * n + n) / 2
    actual_sum = sum(n_list)
    return actual_sum - e_sum




