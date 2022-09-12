import random


user1Count=0
user2Count=0
winNum=3

while True:
  choices=["rock","paper","scissors"]
  compChoice=random.choice(choices)
  user2= input("My choice is : ")
  print()
  if(compChoice==choices[0] and user2==choices[1]):
    user2Count+=1
  elif(compChoice==choices[0] and user2==choices[2]):
    user1Count+=1
  elif(compChoice==choices[2] and user2==choices[1]):
    user1Count+=1
  elif(compChoice==choices[1] and user2==choices[0]):
    user1Count+=1
  elif(compChoice==choices[2] and user2==choices[0]):
   user2Count+=1
  elif(compChoice==choices[1] and user2==choices[2]):
   user2Count+=1
  elif(compChoice==choices[0] and user2==choices[0]):
    print("Choices are same ! ")
    continue
  elif(compChoice==choices[1] and user2==choices[1]):
    print("Choices are same ! ")
    continue
  elif(compChoice==choices[2] and user2==choices[2]):
    print("Choices are same ! ")
    continue
  if(user1Count>user2Count and user1Count==winNum):
   print("computer has won ! ")
   print("The final score is Computer: "+str(winNum)+" and User2: "+str(user2Count)+"")
   break
  if(user2Count>user1Count and user2Count==winNum):
   print("User2 has won ! ")
   print("The final score is User2: "+str(winNum)+" and Computer: "+str(user1Count)+"")
   break
 
 #ROCK, PAPER, SCISSORS GAME IN PYTHON
   
 