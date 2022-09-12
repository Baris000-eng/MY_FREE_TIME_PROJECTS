inp= input("Enter the upper boundary: ")
countZero=0
countOne=0
countTwo=0
countThree=0

for i in range(1,int(inp)+1):
  print("The remainder of "+str(i)+" divided by 4 is "+str(i%4))
  if(i%4==0):
    countZero+=1
  elif(i%4==1):
    countOne+=1
  elif(i%4==2):
    countTwo+=1
  elif(i%4==3):
    countThree+=1

  print(str(countZero)+" numbers are divisible by 4 !")
  print(str(countOne)+" numbers are not divisible by 4 ! The remainder of the division of each of these numbers by 4 is 1.")
  print(str(countTwo)+" numbers are not divisible by 4 ! The remainder of the division of each of these numbers by 4 is 2.")
  print(str(countThree)+" numbers are not divisible by 4 ! The remainder of the division of each of these numbers by 4 is 3.")