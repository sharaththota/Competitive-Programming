import unittest
def is_valid(code):
       stack=[]
       for i in range(len(code)):
           
          if (code[i] == '{' or code[i] == '(' or code[i] == '['):
              stack.append(code[i])
          if (code[i] == '}' or code[i] == ')' or code[i] == ']'):
              if not stack:
                   return False
              elif (matching(stack.pop(), code[i]) ==False ):
                  return False
     
       if not stack:
           return True
       else:
           return False

def matching(a,b):
       if (a== '(' and  b== ')'):
         return True
       elif (a== '{' and b== '}'):
         return True
       elif (a== '[' and b == ']'):
         return True
       else:
         return False
