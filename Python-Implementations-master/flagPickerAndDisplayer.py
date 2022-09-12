import turtle
import time
import random

#Very nice looking project. It can be used for teaching children which flag belongs to which country. 

tur= turtle.Turtle()
w = turtle.Screen()
totalWaitingTime=0
inp= input("Please enter your flag choice: ")
if int(inp)==1 or int(inp)==4:
 print("You choosed "+str(inp)+"th flag. ")
elif int(inp)==2:
  print("You choosed "+str(inp)+"nd flag. ")
elif int(inp)==3:
  print("You choosed "+str(inp)+"rd flag. ")  
print()
print("Picked flag is loading ....")
time.sleep(random.randint(1,10))
print(".....")
time.sleep(random.randint(1,10))
print("....")
time.sleep(random.randint(1,10))


if(int(inp)<0 or int(inp)>4):
  print("Invalid choice! No flag displayed")

if int(inp)==1:
  w.title("Germany Flag!")
  tur.fillcolor('black')
  tur.begin_fill()
  tur.goto(100,0)
  tur.goto(100,-25)
  tur.goto(0,-25)
  tur.goto(0,0)
  tur.end_fill()

  tur.fillcolor('red')
  tur.begin_fill()
  tur.goto(0,-50)
  tur.goto(100,-50)
  tur.goto(100,-25)
  tur.goto(0,-25)
  tur.end_fill()

  tur.fillcolor('yellow')
  tur.begin_fill()
  tur.goto(0,-75)
  tur.goto(100,-75)
  tur.goto(100,-50)
  tur.goto(0,-50)
  tur.end_fill()
  tur.goto(0,-200)
  tur.hideturtle()
elif int(inp)==2:
  w.title("Russia Flag! ")
  tur.fillcolor('white')
  tur.begin_fill()
  tur.goto(100,0)
  tur.goto(100,-25)
  tur.goto(0,-25)
  tur.goto(0,0)
  tur.end_fill()

  tur.fillcolor('blue')
  tur.begin_fill()
  tur.goto(0,-50)
  tur.goto(100,-50)
  tur.goto(100,-25)
  tur.goto(0,-25)
  tur.end_fill()

  tur.fillcolor('red')
  tur.begin_fill()
  tur.goto(0,-75)
  tur.goto(100,-75)
  tur.goto(100,-50)
  tur.goto(0,-50)
  tur.end_fill()

  tur.goto(0,-200)
  tur.hideturtle()
elif int(inp)==3:
  w.title("Poland Flag! ")
  tur.fillcolor('white')
  tur.begin_fill()
  tur.goto(100,0)
  tur.goto(100,-50)
  tur.goto(0,-50)
  tur.goto(0,0)
  tur.end_fill()

  tur.fillcolor('red')
  tur.begin_fill()
  tur.goto(0,-100)
  tur.goto(100,-100)
  tur.goto(100,-50)
  tur.goto(0,-50)
  tur.end_fill()

  tur.goto(0,-200)
  tur.hideturtle()
elif int(inp)==4:
  w.title("As bayrakları! ")      
  tur.fillcolor('red')
  tur.begin_fill()
  tur.goto(0,-400)
  tur.goto(0,0)
  tur.goto(250,0)   
  tur.goto(250,-125) 
  tur.goto(0,-125)     
  tur.goto(0,0)
  tur.end_fill()
  tur.up()
  tur.goto(80,-80)          
  tur.color('white')           
  tur.begin_fill()            
  tur.circle(30)              
  tur.end_fill()
  tur.goto(85,-77)            
  tur.color('red')             
  tur.begin_fill()             
  tur.circle(27)              
  tur.end_fill()  

  tur.goto(110,-50)
  tur.fillcolor('white')
  tur.begin_fill()
  for v in range(0,5):
        tur.forward(50)# moving turtle 100 units forward
        tur.right(144)# rotating turtle 144 degree to the right
  tur.end_fill()
 
