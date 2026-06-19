'''OOP'''
'''CLASSES'''

# class A:
#      def __init__(self,fname,lname,age,address):
#           self.fname=fname
#           self.lname=lname
#           self.age =age
#           self.address=address
#      def get_name(self):
#          return self.fname + " " + self.lname
#      def upper_name(self):
#           return self.fname.upper()
# s=A("fsf","ddd",55,"ktm") 
# s2=A("oshan","baj",445,"ddd")           
# print(s.get_name())
# print(s2.get_name())
# print(s2.fname)
# print(s2.upper_name())

# l=[]
# class A:
#     def __init__(self,name,address):
#         self.name=name
#         self.address = address

# for i in range(3):
#     name=input("enter name")
#     address=input("enter the adderss")
#     l.append(A(name,address))
# new_name=input("enter the name to search")
# for A in l:   #-->A= student --->overwrite value
#     if A.name == new_name:
#        A.address=input("enter new address")
#        break
# for student in l:
#    print("name=",student.name)
#    print("address",student.address)


# class A:
#     def __init__(self,name,age):
#          self.name= name
#          self.age = age
#     def __add__(self,xyz):
#          return self.age + xyz.age
#     def __mul__(self,xyz):
#          return self.age * xyz.age
    
# s1=(A("oshan",20))
# s2=(A("baj",20))
# s3=s1+s2
# print(s3)

# s3=s1*s2
# print(s3)


# class Animal:
#     def __init__(self,name,age,color):
#         self.name=name
#         self.age=age
#         self.color=color
#     def speak(self):
#         return "wxyz"
#     def wag_tail(self):
#         return 'wag'




# class Vehicle:
#     def __init__(self, name, colour, brand):
#         self.name = name
#         self.colour = colour
#         self.brand = brand
#     def price(self):
#         return 11

#     def use_for(self):
#         return "transform"

#     def __str__(self):
#         return f"Vehicle(name={self.name}, colour={self.colour}, brand={self.brand})"


# class Car(Vehicle):
#     def __init__(self, name, colour, brand, type):
#         super().__init__(name, colour, brand)
#         self.type = type

#     def __str__(self):
#         return f"Car Details:\nName: {self.name}\nColour: {self.colour}\nBrand: {self.brand}\nType: {self.type}"


# class Motorcycle(Vehicle):
#     def __init__(self, name, colour, brand, type):
#         super().__init__(name, colour, brand)
#         self.type = type

#     def __str__(self):
#         return f"Motorcycle(name={self.name}, colour={self.colour}, brand={self.brand}, type={self.type})"


# A = Car("xyz", "col", "df", "sedan")
# B = Motorcycle("xyffz", "coldf", "fddf", "cruiser")

# print(A)
# print(B)
    

# class Root:
#     f="i am parent class"
# class A(Root):
#     fx="A derived class"
# class B(Root):
#     fx="B derived class"
# class C(A,B):
#     fx="B derived class"
# # print(C.f)
# print(cls for cls in C.__mro__)



  
# task1:create library management system by using class and object