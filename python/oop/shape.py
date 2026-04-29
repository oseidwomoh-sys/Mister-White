class Shape:
    def __init__(self, color):
        self.color = color

    def area(self):
        raise NotImplementedError("Subclasses must implement this method")

    def perimeter(self):
        raise NotImplementedError("Subclasses must implement this method")

class Circle(Shape):
    def __init__(self, color, radius):
        super().__init__(color)
        self.radius = radius

    def area(self):
        return 3.14 * self.radius ** 2

    def perimeter(self):
        return 2 * 3.14 * self.radius

class Rectangle(Shape):
    def __init__(self, color, width, height):
        super().__init__(color)
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

    def perimeter(self):
        return 2 * (self.width + self.height)

# Example usage
if __name__ == "__main__":
    circle = Circle("red", 5)
    print(f"Circle color: {circle.color}")
    print(f"Circle area: {circle.area()}")
    print(f"Circle perimeter: {circle.perimeter()}")

    rectangle = Rectangle("blue", 4, 6)
    print(f"Rectangle color: {rectangle.color}")
    print(f"Rectangle area: {rectangle.area()}")
    print(f"Rectangle perimeter: {rectangle.perimeter()}")
