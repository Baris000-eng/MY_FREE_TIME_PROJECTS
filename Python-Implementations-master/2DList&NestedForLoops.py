initialList= [[1,2],[3,4,5],[6,7,8,9]]
print(initialList)
print(initialList[0][0])#Gives 1 
print(initialList[0][1])#Gives 2
print(initialList[1][0])#Gives 3
print(initialList[1][1])#Gives 4
print(initialList[1][2])#Gives 5
print(initialList[2][0])#Gives 6
print(initialList[2][1])#Gives 7
print(initialList[2][2])#Gives 8
print(initialList[2][3])#Gives 9

for row1 in initialList:
  print(row1)#prints out the elements inside the list called initialList


for row2 in initialList:
  for col in row2:
    print(col)#Prints each of the numbers in the elements of the initialList

