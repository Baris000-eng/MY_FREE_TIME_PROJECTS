#Try & except playground
try:
 inpNum= int(input("Please enter a number: "))
 print(inpNum)
except ValueError as error:
 print("Invalid input !")



try: 
  a= 20/0
except ZeroDivisionError as error:
  print(error) 



