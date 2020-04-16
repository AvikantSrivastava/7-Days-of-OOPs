class Point:
    def __init__(self, x, y, z):
        self.x = x
        self.y = y
        self.z = z

    def sqSum(self):
        a = self.x * self.x
        b = self.y * self.y
        c = self.z * self.z
        sum_final = a + b + c
        return sum_final

obj1 = Point(2,3,5)
print(obj1.sqSum())
