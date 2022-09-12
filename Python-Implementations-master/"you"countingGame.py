def findMax(num1,num2,num3):
  if(num1>=num2 and num1>=num3):
    return num1
  if(num2>=num1 and num2>=num3):
    return num2
  if(num3>=num1 and num3>=num2):
    return num3

def findMin(num4,num5,num6):
  if(num4<=num5 and num4<=num6):
    return num4
  if(num5<=num4 and num5<=num6):
    return num5
  if(num6<=num4 and num6<=num5):
    return num6

listOfSampleTexts= ["Hi how are you, you are the best programmer in the world", "Are you cooking are you playing table tennis or are you jogging?", "What are you doing?"]

youCount= [0,0,0]
you= "you"
for i in range(0,len(listOfSampleTexts)):
 youCount[i]= listOfSampleTexts[i].count("you")
 
for a in range(0,len(youCount)):
  print("The you count for the "+str(a+1)+"th text in the listOfSampleTexts is: "+str(youCount[a])+"")

maxYouNumber= findMax(youCount[0],youCount[1],youCount[2])
minYouNumber= findMin(youCount[0],youCount[1],youCount[2])

for k in range(0,len(youCount)):
  if(youCount[k]==maxYouNumber):
      print(""+str(youCount[k])+" is the maximum existence number of the string called "+you+",you win")
  if(youCount[k]==minYouNumber):
    print(""+str(youCount[k])+" is the minimum existence number of the string called "+you+", You lost")
    








 
  
 



