# #---->exe
# g={"name":input("enter your name ="),
#    'age':int(input("enter your age =")),
#    "roll_no":int(input("enter your roll_no =")),
#    "mark":
#    {'m1':int(input("enter your mark=")),
#     "m2" :  int(input("enter your mark")),
#     "m3" :int(input("enter your mark"))

#    }}
# tmark=g["mark"]["m1"]+g["mark"]["m2"]+g["mark"]["m3"]
# per= (tmark/300)*100
# print("REPORT CARD")
# print(f"name = {g["name"]}")
# print(f"age = {g["age"]}")
# print(f"roll ={g["roll_no"]}")
# print(f"total mark ={tmark}")
# print(f"percentage ={per}")
# if(per >39):
#    print("result = pass")
# else:
#    print("result = fail")

# a=5
# while(a!=0):
#     print("*"*a)
#     a=a-1

# for i in range(0,10,2):
#    print(i)



# l1=[1,2,3]
# for i in l1:
#     print(i)
# else:
#     print('done')

# for i in range(0,10):
#    print(i)
#    if(i==5):
#        break
   
# for i in range(0,10):
  
#    if(i==5):
#        continue
#    print(i)

# for i in range (10):
#    if(i%2 == 0):
#       continue
#    print(i)

# a= enumerate(["abc","def","ghi"])
# print(a)

# for i in a:
#     print(i)

# a=5
# for i in range(a):
#     print("*  "*a)
#     a-=1


# a=5
# for i in range(a+1):
#     for j in range(a+1):
#        if(i<j):
#            print("* ",end=" ")

#     print()





# a=int(input("enter the num ="))
# b=a
# fact =1
# for i  in range (1,a):
#  fact =fact *a
#  a-=1;
# print(f"the factriol of {b} is {fact}")


# num_terms = int(input("Enter the number of terms: "))
# a, b = 0, 1
# for _ in range(num_terms):
#     print(a, end=" ")
#     a, b = b, a + b


# num = int(input("Enter the number: "))
# sum = 0
# while num > 0:
#     temp = num % 10
#     sum = sum + temp
#     num = num // 10
# print("Sum of the digits:", sum)


# num = int(input("Enter the number: "))
# a=num
# sum = 0
# sum1=0
# while num > 0:
#     temp = num % 10
#     sum = sum + temp
#     num = num // 10
#     sum1=sum1*10+temp
# if(sum1==a):print("pala")
# else:print("not pala")


# def sum(a,b):
#     add=a+b
#     print(f"sum of two num is {add}")
# sum(2,5)


# def sum(a,b):
#    return a+b
# print(f"sum of two num is {sum(2,5)}")

# def xyz():
#     '''
#     this is string
#     '''
# print(xyz.__doc__)
    
# def gert(name,greeting='hello'):
#  print(greeting +',',name)
# gert("oshan")
# gert("oshan","hi")

# def SI(p,t,r=10):
#         return  (p*t*r)/100
# print(f"simple intrest with default parameter {SI(2000,2,)}")
# print(f"simple intrest without default parameter {SI(2000,2,12)}")


# def sum(a,b):
#    return a+b
# print(f"sum of two num is {sum(b=5,a=5)}")


def add(*args):
   sum=0
   print(args)
   for num in args:
      sum+=num
   return sum
result =add(1,2,3,4,5,6,7,8,9,10)
print("sum",result)
x,y,*unpack=[1,2,3,4,5,6,7,8,9,10]
print(unpack)
