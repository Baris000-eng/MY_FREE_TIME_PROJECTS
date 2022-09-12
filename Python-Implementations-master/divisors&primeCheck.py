num= input("Please enter a non-negative integer: ")
print()

divisorList= []
divisorCount=0



for i in range(1,int(num)+1):
  if int(num)%i==0:
    divisorCount=divisorCount+1
    divisorList.append(i)


print()

print("The divisors of "+str(num)+" are: \n"+str(divisorList))
print("The number of the divisors of "+str(num)+": \n"+str(divisorCount))

if int(divisorCount)==2 and (1 in divisorList) and (int(num) in divisorList):
  print("The number you have entered is a prime number! ")
else:
  print("The number you have entered is not a prime number! ")