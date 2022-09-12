numbers= [2,3,4,5,5,5,5,5,3,3,3,3,4,4,9,9,10,10,10,10,1]
threeCounter=0; twoCounter=0; fiveCounter=0; fourCounter=0; nineCounter=0; tenCounter=0; oneCounter=0


length=len(numbers)
for i in range(0,length):
  if(numbers[i]==2):
    twoCounter+=1
  elif(numbers[i]==3):
    threeCounter+=1
  elif(numbers[i]==4):
    fourCounter+=1
  elif(numbers[i]==5):
    fiveCounter+=1
  elif(numbers[i]==9):
    nineCounter+=1
  elif(numbers[i]==10):
    tenCounter+=1
  elif(numbers[i]==1):
    oneCounter+=1



print("There are "+str(twoCounter)+" two, "+str(threeCounter)+" three, "+str(fourCounter)+" four, "+str(fiveCounter)+" five, "+str(oneCounter)+" one, "+str(nineCounter)+" nine, and "+str(tenCounter)+" ten in the list. ")


#This is a python program finding how many occurences of the numbers are there.