#Recursive and NonRecursive Multiplication Program implemented in Python

def recursiveMultiplication(n1,n2):
  if(n1<0 and n2<0): 
    n1=-n1 
    n2=-n2
  if(n1==1):
    return n2
  elif(n2==1): 
    return n1
  elif(n1>=0):
    return n2+recursiveMultiplication(n1-1,n2)
  elif(n1<0 and n2>0):
    return n1+recursiveMultiplication(n1,n2-1)

def nonRecursiveMultiplication(num1,num2):
  return num1*num2




print("The multiplication1 of 3 and 4 is "+str(recursiveMultiplication(3,4)))
print("The multiplication2 of 3 and 4 is "+str(nonRecursiveMultiplication(3,4)))
print()
print("The multiplication1 of 0 and 2 is "+str(recursiveMultiplication(0,2)))
print("The multiplication2 of 0 and 2 is "+str(nonRecursiveMultiplication(0,2)))
print()
print("The multiplication1 of -2 and -9 is "+str(recursiveMultiplication(-2,-9)))
print("The multiplication2 of -2 and -9 is "+str(nonRecursiveMultiplication(-2,-9)))
print()
print("The multiplication1 of 8 and -3 is "+str(recursiveMultiplication(8,-3)))
print("The multiplication2 of 8 and -3 is "+str(nonRecursiveMultiplication(8,-3)))
print()
print("The multiplication1 of -9 and 5 is "+str(recursiveMultiplication(-9,5)))
print("The multiplication2 of -9 and 5 is "+str(nonRecursiveMultiplication(-9,5)))

 

