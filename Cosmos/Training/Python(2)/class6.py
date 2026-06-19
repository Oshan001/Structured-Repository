"""revision of class5.py"""
"""decoratoers"""

# def decorator(func):
#     def wrapper():
#         print("first thing.")
#         func()
#         print("second thing.")
#     return wrapper
# @decorator
# def hello():
#     print("hello")
# hello()


# commands={}
# def command(func):
#     def wrapper():
#         commands[func.__name__]=func
#         return wrapper
# @command
# def hello():
#     print("hello world")
# @command
# def tey():
#     print(" this is tey")
# hello()
# tey()
# commands['hello']()
# print(commands)



# commands={}
# def decorator(func):
#     def wrapper():
#      commands[func.__name__]=func #func.__name__ = "tey"=tey()
#     return wrapper
# @decorator
# def hello():
#     print("hello world")
# @decorator
# def tey():
#     print(" this is tey")

# def bye():
#     print("bye")
# @decorator
# def hi():
#     print("hi")
# print(hello.__name__)
# hello()
# print(hello.__name__)
# @decorator
# tey()
# print(tey.__name__)
# bye()
# hi()
# a=input("enter the command you want to access")
# commands[a]()
# print(commands)


"""library"""

'""built-in library""'

# from random import *
# a=randint(1,10)
# print(a)
# s=["table tennis","football","cricket"]
# a=choice(s)
# print(a)


# import random 
# a=random.randint(1,10)
# print(a)
# s=["table tennis","football","cricket"]
# a=random.choice(s)
# print(a)
# a=random.choices(1,10) 
# print(a)
"""gussing game"""
# import random
# bot=random.randint(1,10)
# count=4
# print(bot)
# for i in range(1,5): 
#    user=int(input("enter your gussing number"))
#    if bot==user:
#      print(f"{bot}you win")
#      break
#    elif bot>user:
#      print(f"you have {count} chances left")
#      print(f"your {user} number is smaller put a bit higher number")
#      count-=1
#    elif bot<user:
#     print(f"you have {count} chances left")
#     print(f"your {user} number is higher put a bit lower number")
#     count-=1
# print("you lose")



# import os
# import flask
# print("current dir is ",os.getcwd())
# os.mkdir("new_dir")
# os.rmdir("new_dir1") 
# os.chdir("new_dir")
# os.mkdir("inside directly")
# os.system("touch file1.txt")
# os.system("shutdown /s /t 0")