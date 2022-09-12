import turtle
import random




while True:
 t= turtle.Turtle()
 r= random.randint(1,100)
 t.circle(r)
 t.goto(0,2*r)
 x= turtle.Turtle()
 r2= random.randint(1,100)
 x.goto(0,-2*r2)
 x.circle(r2)
 
 if r2>80 and r>80:
   break

 