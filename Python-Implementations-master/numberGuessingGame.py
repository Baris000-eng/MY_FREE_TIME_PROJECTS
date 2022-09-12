import random
num_list= [1,2,4,9,6,5,8,11,17,22,10]
random_choice= random.choice(num_list)
guess_Limit=5
guess_Num=0
while True:
  number= input("Enter a number: ")
  guess_Num+=1
  if(guess_Num>guess_Limit and random_choice!=int(number)):
    print("You exceed the guess limit ! ")
    break
  if(random_choice==int(number)):
    print("You won the game! You have found the random number picked from the list. ")
    break
  if(int(number)>random_choice):
    print("The number you have entered is greater than the random choice, please enter a smaller number to find the random choice ")
  elif(int(number)<random_choice):
    print("The number you have entered is smaller than the random choice, please enter a bigger number to find the random choice ")


#The Number Guessing Game implemented in Python by me