import turtle
import time


print("*****Welcome to the Farm Creation Program****")
time.sleep(2)
print("...")
print("...")

t = turtle.Turtle()
turtle.title("My Little Farm")
t.fillcolor('red')
t.begin_fill()
for i in range(4):
  t.forward(200)
  t.right(90)
t.end_fill()

t.fillcolor('blue')
t.begin_fill()
t.goto(100,100)
t.goto(200,0)
t.end_fill()

t.goto(200,-200)

t.fillcolor('yellow')
t.begin_fill()
t.goto(90,-200)
t.goto(90,-150)
t.goto(115,-150)
t.goto(115,-200)
t.end_fill()



t.goto(200,-200)
t.goto(200,0)
t.goto(0,0)
t.fillcolor('green')
t.begin_fill()
t.goto(50,50)
t.goto(50,90)
t.goto(60,90)
t.goto(60,60)
t.end_fill()



t.goto(0,0)
t.goto(0,-200)

x= -10
while True:
  t.goto(x,-200)
  t.goto(x,-190)
  t.goto(x,-200)
  x= x-20
  if x<-250:
    break


t.goto(0,-200)

t.goto(0,0)

t.fillcolor('brown')
t.begin_fill()
t.goto(50,0)
t.goto(50,-60)
t.goto(100,-60)
t.goto(100,0)
t.end_fill()

t.fillcolor('brown')
t.begin_fill()
t.goto(120,0)
t.goto(120,-60)
t.goto(170,-60)
t.goto(170,0)
t.end_fill()



t.goto(0,0)
t.goto(0,-200)

t.goto(-125,-200)
t.fillcolor('green')
t.begin_fill()
t.goto(-125,-160)
t.goto(-125,-140)
t.goto(-145,-140)
t.goto(-145,-160)
t.goto(-125,-160)
t.end_fill()

t.fillcolor('orange')
t.begin_fill()
t.goto(-125,-190)
t.goto(-75,-190)
t.goto(-75,-200)
t.goto(-75,-160)
t.goto(-125,-160)
t.goto(-125,-140)
t.end_fill()

t.fillcolor('yellow')
t.begin_fill()
t.goto(-145,-140)
t.goto(-142,-140)
t.goto(-138,-130)
t.goto(-136,-140)
t.goto(-134,-140)
t.goto(-130,-130)
t.goto(-128,-140)
t.goto(-125,-140)
t.end_fill()

t.goto(-125,-160)
t.fillcolor('black')
t.begin_fill()
t.goto(-55,-160)
t.goto(-55,-167)
t.goto(-75,-167)
t.goto(-75,-160)
t.end_fill()

