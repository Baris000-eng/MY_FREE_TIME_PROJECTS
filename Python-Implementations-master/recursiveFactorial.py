def recursiveFactorial(n):
  if n<0:
    raise Exception("Invalid factorial!!")
  elif(n==0):
    return 1
  elif(n==1):
    return 1
  elif(n>=1):
    return n*recursiveFactorial(n-1)

for i in range(0,9):
 print("The factorial of "+str(i)+" is "+str(recursiveFactorial(i))+"")