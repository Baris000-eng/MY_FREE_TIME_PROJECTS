import turtle
import time


x= turtle.Turtle()
initial_x=50
initial_y=50
while True:
 time.sleep(3)
 x.goto(initial_x,initial_y)
 x.goto(initial_x+50,0)
 x.goto(initial_x,-initial_y)
 x.goto(initial_x-50,initial_y-50)
 x.goto(initial_x,initial_y)
 x.goto(initial_x,-initial_y)
 x.goto(initial_x,initial_y)
 x.goto(initial_x+50,0)
 time.sleep(3)
 initial_x=initial_x+50
 if initial_x>300:
  x.goto(0,0)
  break
  