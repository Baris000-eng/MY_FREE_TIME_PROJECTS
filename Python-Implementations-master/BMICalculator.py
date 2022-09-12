import time 

lower_normal_bound=0
upper_normal_bound=0


while True:
  print("Welcome to the Body Mass Index Calculator ! ")
  choice= input("Please enter yes to start, no to stop: ")
  if(choice.lower()=="no"):
    break
  else:
   time.sleep(4)
   print("Loading ...")
   time.sleep(4)
   print("Loading continues ...")
   print("...")
   weight= input("Please enter your weight in kg: ")
  if(int(weight)<=0):
   print("Invalid weight ! ")
   break
   height= input("Please enter your height in cm: ")
  if(int(height)<=0):
   print("Invalid height !")
   break
weight=int(weight)
height= int(height)/100
bmi= weight/(height*height)
lower_normal_bound= 18.5*(height**2)
upper_normal_bound=24.9*(height**2)
print("Your BMI is "+str(bmi))
if(bmi<=18.4):
  print("You are thin. ")
  print("You can gain at least"+str(lower_normal_bound-weight)+" kg and at most "+str(upper_normal_bound-weight)+" kg to have a normal weight. ")
elif(18.5<=bmi and bmi<=24.9):
   print("You have a normal weight.")
elif(25.0<=bmi and bmi<=29.9):
   print("You are overweight.")
   print("You can lose at least "+str(weight-upper_normal_bound)+" kg and at most "+str(weight-lower_normal_bound)+" to have a normal weight. ")
elif(bmi>=30.0):
   print("You are obese")
   print("You can lose at least "+str(weight-upper_normal_bound)+" kg and at most "+str(weight-lower_normal_bound)+" to have a normal weight. ")

#The Body Mass Index Calculator implemented in Python




