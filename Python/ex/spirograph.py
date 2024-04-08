from turtle import Turtle, Screen
import random

bob = Turtle()
bob.shape("turtle")
bob.screen.title('밥이 그림을 그려요')
bob.speed("fastest")

# def random_color():
#     r = random.random(0, 255)
#     g = random.random(0, 255)
#     b = random.random(0, 255)
#     color = (r, g, b)
#     return color

def draw(size_of_gap):
    for _ in range(360 // size_of_gap):
        bob.color(random.random(),random.random(),random.random())
        bob.circle(100)
        bob.setheading(bob.heading() + size_of_gap)

draw(5)


# def forward():
#     bob.up(10)
# def backward():
#     bob.down(10)
# def right():
#     bob.right(10)
# def left():
#     bob.left(10)

# bob.onkey(forward, "Up")
# bob.onkey(backward, "Down")
# bob.onkey(left, "Left")
# bob.onkey(right, "Right")



screen = Screen()
screen.exitonclick()