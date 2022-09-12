import time
print("Welcome to the Who Wants to Earn 2000 USD Dollars?.")
moneyEarned= 0
yesOrNo= input("Do you want to play? : ")
if(yesOrNo.lower()=="yes"):
  print("Your first question is coming. The value of this question is 500 USD dollars ")
  print("1-)What is the capital city of United States of America? ")
  print("A-) New York")
  print("B-) Los Angeles")
  print("C-) Miami")
  print("D-) Washington, D.C.")
  time.sleep(10)
  input1= input("What is your answer, time is about to up?: ")
  if(input1=='D'):
    print("Correct! You have earned 500 dollars in total. Let's proceed to the second question")
    moneyEarned=moneyEarned+500
    print("Your second question is coming. The value of this question is 1000 dollars ")
    print("What is the result of 1+2+3+4+5+....+100?")
    print("A-) 5000")
    print("B-) 5050")
    print("C-) 5100")
    print("D-) 5150")
    time.sleep(10)
    conf= input("Are you confused? If yes, here is your check worthy of 500 USD dollars: ")
    if(conf=="Yes"):
      print("Yes, I am very confused. I want to withdraw from the competition with the 500 USD dollars check. Thank you so much. ")
    elif(conf=="No"):
     input2= input("What is your answer? Time is about to up: ")
     if(input2=='B'):
      print("Correct! You have earned 1000 dollars in total. You have guaranteed to have 1000 dollars. Let's proceed to the third question")
      moneyEarned=1000
      print("Your third question is coming. The value of this question is 2000 dollars")
      print("Which car brand does not belong to Germany?")
      print("A-) Audi")
      print("B-) Toyota")
      print("C-) Bmw") 
      print("D-) Mercedes")
      time.sleep(10)
      conf2= input("Are you confused? If yes, here is your check worthy of 1000 USD dollars: ")
    if(conf2=="Yes"):
      print("Yes, I am very confused. I want to withdraw from the competition with the 500 USD dollars check. Thank you so much. ")
    elif(conf2=="No"):
      input3=input("What is your answer?: ")
      if(input3=='B'):
        moneyEarned+=1000
        print("Congratulations! You have earned "+str(moneyEarned)+" dollars in total. ")
      elif(input3=='A' or input3=='D' or input3=='C'):
        print("Incorrect! You have earned 1000 USD dollars in total. Thank you for your attendance to the Who Wants to Earn 2000 USD dollars program.")
    elif(input2=='A' or input2=='C' or input2=='D'):
      print("Incorrect! Thank you for your attendance to the Who Wants to Earn 2000 USD dollars program.")
  elif(input1=='B' or input1=='C' or input1=='A'):
    print("Incorrect! Thank you for your attendance to the Who Wants to Earn 2000 USD dollars program.")
  
  
#WHO WANTS TO EARN 2000 DOLLARS GAME IN PYTHON 