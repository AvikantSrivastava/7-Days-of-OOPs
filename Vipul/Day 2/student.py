class Student:
    def setName(self, name):
        self.__name = name

    def getName(self):
        return self.__name

    def setRollNumber(self, RollNumber):
        self.__RollNumber = RollNumber

    def getRollNumber(self):
        return self.__RollNumber


baccha = Student()
baccha.setName("Nibba")
print("Name:", baccha.getName())
baccha.setRollNumber(420)
print("Roll Number:", baccha.getRollNumber())
