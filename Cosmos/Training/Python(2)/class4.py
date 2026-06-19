# # try:
# #     a= input("enter")
# #     b=6
# # except ValueError :
# #     print("value error")
# # else:
# #     print("not a value error")


# # try:
# #     a= int(input("enter"))
# #     b=6
# #     if(a < 0):
# #         raise ValueError("d")
# # except ValueError :
# #     print("value error")




# # try:
# #     a= int(input("enter"))
# #     b= int(input("enter"))
# #     c= int(input("enter"))
# #     if(b == c):
# #         raise ZeroDivisionError("num cant be negative")
# #     print(a/(b-c))
# # except ZeroDivisionError as e :
# #     print(e)




# # roll=[]
# # for i in range(0,3):
# #     no=int(input("enter your roll no"))
# #     try:
# #         if no in roll:
# #           raise ValueError(f"roll no{no}is already input")
# #     except ValueError as error:
# #        print (error)
# #     else:
# #        roll.append(no)
# #     finally:
# #        print("out of except")
# # print (roll)





# # def div(x,y):
# #     try:
# #         R=x/y
# #     except ZeroDivisionError:
# #         print("cant divided by zero")
# #         raise
# #     return R
# # try:
# #     div(0,5)
# # except ZeroDivisionError:
# #     print("error")




# # def tri(x,y,z):
# #     try:
# #         if((x+y)>z and (y+z)>x and (z+x)>y):
# #             print("it is a triangle")
# #         else :
# #             raise ValueError(" not  a triangle ")
# #     except ValueError as e:
        
# #         raise
# # try:
# #    a=int(input("enter the value of triangle"))
# #    b=int(input("enter the value of triangle"))
# #    c=int(input("enter the value of triangle")) 
# #    tri(a,b,c)
# # except ValueError as e:
# #     print(e)

      


# '''Recursion'''
# # def sum(n):
# #     if n==0:
# #         return 0
# #     else:
# #         return n+sum(n-1)
# # print(sum(10))



# # def fact(n):
# #     if n==0:
# #         return 1
# #     else:
# #         return n*fact(n-1)
# # print(fact(5))



# # def fibo(n):
# #     if n<=1:
# #         return 1
# #     else:
# #         return fibo(n-1)+fibo(n-2)
# # for i in range(10):
# #     print(fibo(i),end="     ")


# '''lambda function'''
# # from functools import reduce
# # add= lambda x,y:x+y
# # result = add(3,3)
# # print(result)

# # from functools import reduce
# # num=[1,2,3,4,5]
# # sqr=list(map(lambda x:x**2,num))
# # print(sqr)

# # from functools import reduce
# # num=[1,2,3,4,5]
# # sqr=list(filter(lambda x:x%2==0,num))
# # print(sqr)



# # from functools import reduce
# # num=[1,2,3,4,5]
# # add=(reduce(lambda x, y:x+y,num))
# # print(add)

# '''file handeling'''
# # file = open("myfile.txt", 'w')
# # file.write("hello world\n")
# # file.close()
# # file = open("myfile.txt", 'r')
# # content = file.read()
# # print(content)
# # file.close()
        

# '''--->auto close file'''
# # with open ("my file.txt",'w') as file:
# #            file.write("this is  line of text\n")
# #            file.write("another line")
# # with open("my file.txt","r") as file:
# #         for line in file:
# #                 print(line,end=" ")


# # import json
# dict={
#     "name":"",
#     "age":10

# }
# with open("text.json","w")as f:
#     json.dump(dict,f)
# with open("text.json","r")as f:
#     loaded =json.load(f)
# print(loaded)


# import json
# test2=[{
#     "name":"",
#     "age":10

# }]
# with open("text.json","w")as f:
#     json.dump(test2,f)
# with open("text.json","r")as f:
#     context =json.load(f)
# print(context)


#----->STUDENT DATABASE

# import json

def add_student(dis):
    try:
      name = input("Enter your name: ")
      if not name:
          raise ValueError("ERROR : INPUT VALUE")
      
      student_class = input("Enter your class: ")
      if not student_class.isdigit():
            raise ValueError("ERROR: Class should be a number.")    

      roll = input("Enter your roll: ")
      if not roll.isdigit():
       raise ValueError("Enter a valid numeric value")
    
    except ValueError as e:
        print(e)
    else:
        dis[name] = {"name": name, "class": int(student_class), "roll":int(roll)}
        print(f"{dis[name]["name"]} is input sucessfully")

# def add_student(dis):
#     try:
#         name = input("Enter your name: ")
#         if not name:
#             raise ValueError("ERROR: Name cannot be empty.")
        
#         student_class = input("Enter your class: ")
#         if not student_class.isdigit():
#             raise ValueError("ERROR: Class should be a number.")
        
#         roll = input("Enter your roll: ")
#         if not roll.isdigit():
#             raise ValueError("ERROR: Roll should be a number.")
        
#     except ValueError as e:
#         print(e)
#     else:
#         dis[name] = {"name": name, "class": int(student_class), "roll": int(roll)}
#         print(f"Student {name} added successfully!")



# def display_students(dis):
#     if not dis:  # Check if dis is empty
#         print("No students found.")
#     else:
#         for i in dis.values():
#             print(f"Name: {i['name']}, Class: {i['class']}, Roll: {i['roll']}")


# def search_student(dis):
#     a = int(input("Enter the roll you want to search: "))
   
#     for student in dis.values():
#         if student["roll"] == a:
#             print("Found")
#             print(f"Name: {student['name']}, Class: {student['class']}, Roll: {student['roll']}")
#             break
#     else:
#         print("Not found")

# def update_student(dis):
#     name = input("Enter the name of the student to update: ")
#     if name in dis:
#         field = ["name", "class", "roll"]
#         for f in field:
#             new_value = input(f"Enter new {f}: ")
#             if f == "class" or f == "roll":
#                 dis[name][f] = int(new_value)
#             else:
#                 dis[name][f] = new_value
#         print("Student info updated successfully!")
#     else:
#         print("Student not found.")

# def delete_student(dis):
#     name = input("Enter the name of the student to delete: ")
#     if name in dis:
#         del dis[name]
#         print("Student deleted successfully!")
#     else:
#         print("Student not found.")

dis = {}
with open("textt.json","w") as f :
 while True:
    print("""1. ADD STUDENT INFO
2. DISPLAY ALL STUDENTS
3. SEARCH STUDENT
4. UPDATE STUDENT
5. DELETE STUDENT
Any number to exit""")
    
    c = input("Enter your option: ")
    
    match c:
        case '1':
            add_student(dis)
        
        # case '2':
        #     display_students(dis)
        
        # case '3':
        #     search_student(dis)
        
        # case '4':
        #     update_student(dis)
        
        # case '5':
        #     delete_student(dis)
        
        case _:
            break



