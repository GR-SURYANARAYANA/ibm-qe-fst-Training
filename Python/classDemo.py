class myClass:
    'This is example class'
    x = 10
    def __init__(self,name = "suryanarayana" ,age ="22"):
        self.name = name
        self.age = age
    def __str__(self):
        return f"name : {self.name}, age : {self.age}"
p1 = myClass()
print(p1.x)
print(p1)

