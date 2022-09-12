matrix1 = [[0 for x in range(3)] for y in range(3)]
matrix2 = [[0 for x in range(3)] for y in range(3)]
result = [[0 for x in range(3)] for y in range(3)]

for i in range (3):
  for j in range(3):
    inp= int(input("Please enter the element in the place matrix1["+str(i)+"]["+str(j)+"]: "))
    matrix1[i][j]=inp#Assigning the inputted integers to the elements of the matrix1

for i in range(3): 
    for j in range(3): 
        print(matrix1[i][j],end=" ") 
    print() 


print()

for i2 in range(3):
  for j2 in range(3):
    inp2= int(input("Please enter the element in the place matrix2["+str(i2)+"]["+str(j2)+"]: "))
    matrix2[i2][j2]=inp2#Assigning the inputted integers to the elements of the matrix2
    result[i2][j2]= matrix1[i2][j2]+matrix2[i2][j2] #assigning the elements of the result array to the addition of the elements in the matrix1 array and matrix2 array.


for i in range(3): 
    for j in range(3): 
        print(matrix2[i][j],end=" ") 
    print()   


print()
for i in range(3): 
    for j in range(3): 
        print(result[i][j],end=" ") 
    print() 



