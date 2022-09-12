def fibonacciNumbersByUsingRecursion(n):
  if(n==1):
    return 1
  elif(n==0):
    return 0
  else:
    return fibonacciNumbersByUsingRecursion(n-1)+fibonacciNumbersByUsingRecursion(n-2)


numberOfFibonacciNumbers= input("How many fibonacci numbers do you want to print?: ")
numberOfFibonacciNumbers=int(numberOfFibonacciNumbers)
for i in range(0,numberOfFibonacciNumbers):
  print(fibonacciNumbersByUsingRecursion(i))




#This is a python implementation which takes input from user to determine the total number of fibonacci numbers to be printed in the console. Moreover, this python program prints the fibonacci numbers using recursion.








