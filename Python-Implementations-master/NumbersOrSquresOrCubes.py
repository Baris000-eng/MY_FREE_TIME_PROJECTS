number1= input("Number 1: ")
number2= input("Number 2: ")
number3= input("Number 3: ")
number4= input("Number 4: ")
number5= input("Number 5: ")
number6= input("Number 6: ")
number7= input("Number 7: ")
number8= input("Number 8: ")
number9= input("Number 9: ")
number10= input("Number 10: ")#Requesting 10 numbers from user.

number1= int(number1)
number2= int(number2)
number3= int(number3)
number4= int(number4)
number5= int(number5)
number6= int(number6)
number7= int(number7)
number8= int(number8)
number9= int(number9)
number10=int(number10)#String to integer conversions


numbers= [number1,number2,number3,number4,number5,number6,number7,number8,number9,number10]


while True:
 inputChoice= input("Enter your choice showing that whether you print the numbers themselves, the squares of them, or the cubes of them: ")#taking choice input from user
 inputChoice=int(inputChoice)#string to int conversion
 if(inputChoice==0):
   for i in range(0,len(numbers)):
     print(numbers[i])
 elif(inputChoice==1):
    for i in range(0,len(numbers)):
     print(numbers[i]*numbers[i])
 elif(inputChoice==2):
    for i in range(0,len(numbers)):
     print(numbers[i]*numbers[i]*numbers[i])
 else:
    break
   
  
    
   




  