import time
#The implementation of a quiz game about me by using string functions, strings, data types, user inputs, sleep() function, format() function in floats, if statements, and arithmetic operators.
#Programming Language: Python
print("*******Welcome to the Quiz Game About Me !********")
print("Let's start !")
trueAnswerNum= 0
falseAnswerNum= 0
answer= input("Do you want to play? (Yes/No): ")
if(answer.lower()=="yes"):
  print("The first question is coming...")
  time.sleep(2)
  firstAns= input("1-) What is my favorite food?: ")
  if(firstAns.lower()=="pizza"):
    print("Correct! ")
    trueAnswerNum+=1
  else:
    print("Incorrect! ")
    falseAnswerNum+=1
  print("The second question is coming...")
  time.sleep(2)
  secondAns= input("2-) What is the Turkish football team I support? : ")
  if(secondAns.lower()=="fenerbahçe"):
    print("Correct! ")
    trueAnswerNum+=1
  else:
    print("Incorrect! ")
    falseAnswerNum+=1
  print("The third question is coming...")
  time.sleep(2)
  thirdAns= input("3-) How old am I ?: ")
  if(int(thirdAns)==20):
     print("Correct! ")
     trueAnswerNum+=1
  else:
    print("Incorrect! ")
    falseAnswerNum+=1
elif(answer.lower()=="no"):
   print("See you when you are available! ")
else:
  print("Invalid entry !!")
  

if(answer.lower()=="yes"):
 totalQuestionAnswered= trueAnswerNum+falseAnswerNum
 truePercent= trueAnswerNum/totalQuestionAnswered

 falsePercent= falseAnswerNum/totalQuestionAnswered
 print("You have answered "+str(totalQuestionAnswered)+" questions in total. ")
 print("You have answered "+str(trueAnswerNum)+" questions correctly. ")
 print("You have got "+str(falseAnswerNum)+" mistakes in your answers. ")
 print("The percentage of true answers is "+str("{:.2f}".format(truePercent)))
 print("The percentage of false answers is "+str("{:.2f}".format(falsePercent)))
 if(truePercent>=0.5):
  print("Congraturlations! You have passed the quiz about me! ")
 else:
  print("You have failed! ")


  
  


