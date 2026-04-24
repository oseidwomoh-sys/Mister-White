#! /usr/bin/env python3

print("Hello, World!")

print("This is a simple Python script that prints 'Hello, World!' to the console.")

# variable declaration

greeting = "Hello, World!"
print(greeting)

# f-string example
name = "Alice"
print(f"Hello, {name}!")

# multi-line string
multi_line_greeting = """Hello, World!

Welcome to Python programming.

Enjoy coding!
"""
print(multi_line_greeting)

# string concatenation
part1 = "Hello"
part2 = "World"
full_greeting = part1 + ", " + part2 + "!"
print(full_greeting)

# number example
number = 42
print(f"The answer to the ultimate question of life,\nthe universe, and everything is: {number}")

# java: System.out.print(), System.out.println and System.out.printf()

pi = 3.14159
print(f"The value of pi is approximately: {pi}")

# Collections

# list example
fruits = ["apple", "banana", "cherry"]
print("Fruits:", fruits)

# tuple example
coordinates = (10, 20)
print("Coordinates:", coordinates)

# dictionary example, note that dictionaries are unordered collections of key-value pairs
person = {"name": "Alice", "age": 30, "city": "New York"}
print("Person:", person)

# set example
unique_numbers = {1, 2, 3, 4, 5}
print("Unique numbers:", unique_numbers)

# control flow, note that Python uses indentation to define blocks of code
grade = 85
if grade >= 90:
    print("Grade: A")
elif grade >= 80:
    print("Grade: B")
elif grade >= 70:
    print("Grade: C")
elif grade >= 60:
    print("Grade: D")
else:
    print("Grade: F")


