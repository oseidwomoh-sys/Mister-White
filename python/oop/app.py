
# class and constructor in Python
class Student:

    # the constructor method to initialize the attributes of the Student class

    # default constructor method
    def __init__(self):
        self.name = "John Doe"
        self.age = 18
        self.grade = "A"

    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.grade = "A"

    def __init__(self, name, age, grade):
        self.name = name
        self.age = age
        self.grade = grade
        self._whatever = "whatever"
        self.__secret = "super secret"

    def display_info(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Grade: {self.grade}")

    def speak(self):
        print("Hello, I am a student.")

# inheritance in Python
class GraduateStudent(Student):
    def __init__(self, name, age, grade, thesis_title):
        super().__init__(name, age, grade)
        self.thesis_title = thesis_title

    def display_info(self):
        super().display_info()
        print(f"Thesis Title: {self.thesis_title}")

class Employee:
    def __init__(self, name, age, position):
        self.name = name
        self.age = age
        self.position = position

    def display_info(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")
        print(f"Position: {self.position}")

# multiple inheritance in Python
class TeachingAssistant(GraduateStudent, Employee):
    def __init__(self, name, age, grade, thesis_title, position):
        GraduateStudent.__init__(self, name, age, grade, thesis_title)
        Employee.__init__(self, name, age, position)


# Polymorphism and "Duck Typing" in Python
class Dog:
    def speak(self):
        return "Woof!"

class Cat:
    def speak(self):
        return "Meow!"

# you can pass any object that has a speak method to the animal_sound function
# Polimorphism allows us to use the same interface (the speak method) for different types of objects (Dog and Cat)
def animal_sound(animal):
    print(animal.speak())

# Key differences between Python and Java/Kotlin:

# 1. No Access Modifiers: Python does not have access modifiers like public, private, or protected. 
#    Instead, it uses a convention of prefixing an attribute with an underscore (_) to indicate that it is intended for internal use.
#    Another convention is to use double underscores (__) to name-mangle an attribute, making it harder to access from outside the class.
#
# 2. Multiple Inheritance: Python supports multiple inheritance, allowing a class to inherit from multiple parent classes.
#    In contrast, Java and Kotlin only support single inheritance (a class can only inherit from one parent class).
#
# 3. Dynamic Typing: Python is dynamically typed, meaning that you do not need to declare the type of a variable when you create it.
#    In Java and Kotlin, you must declare the type of a variable when you create it.
#    Attributes can be added to an object on the fly, and their types can change at runtime.
#    For example, student.new_attribute = "Hello" would add a new attribute to the student object, and its type would be str.

# Running you code
if __name__ == "__main__":
    student = Student("Alice", 20, "A")
    student.display_info()
    student.speak()

    grad_student = GraduateStudent("Bob", 25, "A", "Thesis Title")
    grad_student.display_info()

    ta = TeachingAssistant("Charlie", 22, "A", "Thesis Title", "Teaching Assistant")
    ta.display_info()

    dog = Dog()
    cat = Cat()
    animal_sound(dog)
    animal_sound(cat)


