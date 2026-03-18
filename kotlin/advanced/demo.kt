// data classes in kotlin
//
// automatically generate equals(), hashCode(), toString() and copy() functions
// immutable by default, but can be made mutable by using var instead of val
data class Student(val id:Int, val name:String, val grade:Double)

// sealed classes in kotlin
// used to represent a restricted class hierarchy, where a value can have one of the types from a limited set, but cannot have any other type

sealed class Shape {
    data class Circle(val radius: Double) : Shape()
    data class Rectangle(val width: Double, val height: Double) : Shape()
    data class Triangle(val base: Double, val height: Double) : Shape()
    data class UnknownShape(val name: String) : Shape()
}

fun printShapeInfo(shape: Shape) {
    when (shape) {
        is Shape.Circle -> println("Circle with radius ${shape.radius}")
        is Shape.Rectangle -> println("Rectangle with width ${shape.width} and height ${shape.height}")
        is Shape.Triangle -> println("Triangle with base ${shape.base} and height ${shape.height}")
        is Shape.UnknownShape -> println("Unknown shape: ${shape.name}")
        // notice that there is no else branch, because the compiler knows that all possible subclasses of Shape are covered
    }
}

abstract class Shape2
class Circle2(val radius: Double) : Shape2()
class Rectangle2(val width: Double, val height: Double) : Shape2()
class Triangle2(val base: Double, val height: Double) : Shape2()
class UnknownShape2 : Shape2()

fun printShapeInfo2(shape: Shape2) {
    when (shape) {
        is Circle2 -> println("Circle with radius ${shape.radius}")
        is Rectangle2 -> println("Rectangle with width ${shape.width} and height ${shape.height}")
        is Triangle2 -> println("Triangle with base ${shape.base} and height ${shape.height}")
        else -> println("Unknown shape")
    }
}

// extension functions in kotlin

fun String.isLehmanEmail(): Boolean = this.endsWith("@lehman.cuny.edu")

fun main() {
    val student1 = Student(1, "Alice", 85.5)
    val student2 = Student(2, "Bob", 90.0)

    println(student1) // Student(id=1, name=Alice, grade=85.5)
    println(student2) // Student(id=2, name=Bob, grade=90.0)

    val circle = Shape.Circle(5.0)
    val rectangle = Shape.Rectangle(4.0, 6.0)
    val triangle = Shape.Triangle(3.0, 4.0)
    val unknownShape = Shape.UnknownShape("Hexagon")

    printShapeInfo(circle) // Circle with radius 5.0
    printShapeInfo(rectangle) // Rectangle with width 4.0 and height 6.0
    printShapeInfo(triangle) // Triangle with base 3.0 and height 4.0
    printShapeInfo(unknownShape) // Unknown shape

    val circle2 = Circle2(5.0)
    val rectangle2 = Rectangle2(4.0, 6.0)
    val triangle2 = Triangle2(3.0, 4.0)
    val unknownShape2 = UnknownShape2()

    printShapeInfo2(circle2) // Circle with radius 5.0
    printShapeInfo2(rectangle2) // Rectangle with width 4.0 and height 6.0
    printShapeInfo2(triangle2) // Triangle with base 3.0 and height 4.0

    printShapeInfo2(unknownShape2) // no output, because there is no else branch and the compiler does not know that all possible subclasses of Shape2 are covered

    val email = "hendrix@lehman.cuny.edu"
    val name = "Hendrix" // also has the new extension function isLehmanEmail() because it is defined for all Strings
    println("Is $email a Lehman email? ${email.isLehmanEmail()}") // false
}
