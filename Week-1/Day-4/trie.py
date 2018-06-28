import unittest

class Trie(object):

    def __init__(self):
        self.root_node = {}

    def add_word(self, word):
        present_node = self.root_node
        is_new_word = False

        
        for char in word:
            if char not in present_node:
                is_new_word = True
                present_node[char] = {}
            present_node = present_node[char]
            
        if "i" not in present_node:
            is_new_word = True
            present_node["i"] = {}

        return is_new_word
