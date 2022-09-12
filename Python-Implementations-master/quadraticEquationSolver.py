import math
#Quadratic Equation Solver
print("****Welcome to the Quadratic Equation Solver****")

coef1= input("Please enter the coefficient of x^2: ")
coef2= input("Please enter the coefficient of x^1: ")
coef3= input("Please enter the coefficient of x^0: ")

delta= int(coef2)**2-4*int(coef1)*int(coef3)

solution1= (-int(coef2)+ math.sqrt(delta))/(2*int(coef1))
solution2= (-int(coef2)- math.sqrt(delta))/(2*int(coef1))
print()
print("The first solution is "+str(solution1))
print("The second solution is "+str(solution2))
print("Goodbye :)")



