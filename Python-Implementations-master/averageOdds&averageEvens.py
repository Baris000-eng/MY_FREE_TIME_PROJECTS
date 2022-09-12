numAmount= input("Please enter the number amount that you want to enter:\n ")
evenSum=0
oddSum=0
evenCount=0
oddCount=0
for i in range(int(numAmount)):
    inputNum= input("Enter the number "+str(i+1)+": \n")
    if int(inputNum)%2==0:
        evenSum= evenSum+inputNum
        evenCount=evenCount+1
    else:
        oddSum=oddSum+inputNum
        oddCount=oddCount+1

if evenCount==0:#For dealing with no even number case
    evenCount=1
elif oddCount==0:#For dealing with no odd number case
    oddCount=1
averageOfEvens= evenSum/evenCount
averageOfOdds= oddSum/oddCount



print("The average of the odd numbers entered is: "+str(averageOfOdds))
print("The average of the even numbers entered is: "+str(averageOfEvens))