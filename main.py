class Car:
    def __init__(self):
        self.name=""
        self.wheels=0
        self.color=""

    def setName(self,name):
        self.name=name
    
    def getName(self):
        return self.name

    def setWheels(self,wheels):
        self.wheels=wheels

    def getWheels(self):
        return self.wheels

    def setColor(self,color):
        self.color=color

    def getColor(self):
        return self.color

toyota =  Car()
toyota.setName("Toyota Jeep")
print(toyota.getName())
toyota.setWheels(4)
print(toyota.getWheels())
toyota.setColor("Red")
print(toyota.getColor())
