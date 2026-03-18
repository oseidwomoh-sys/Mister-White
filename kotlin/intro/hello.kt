fun main() {

  // operators
  //
  // + - * / % ++ -- = += -= *= /= %=

  // concepts:
  // 1. Kotlin is a statically typed language, which means that the type of a variable is determined or inferred at compile time.
  // 2. Kotlin is a strongly typed language, which means that the type of a variable cannot be changed after it has been declared.
  // 3. Kotlin is a type-safe language, which means that the compiler will check for type errors.
  // 4. Kotlin is a null-safe language, which means that the compiler will check for nullability and will not allow null values to be assigned to non-nullable variables.
  //

  // variable "a" is inferred to be of type Double, because the result of the expression "1.0 + 1" is a Double.
  val a = 1.0 + 1 // kotlin can infer the type of a variable, therefore we don't need to provide a variable type. 
  // int a = 1 + 1 // java is strongly typed language, therefore we need to provide a variable type.
  println(a) // 2
  println(a::class.simpleName)
  // System.out.println("Hello, World!");

  //int b = 20;
  //b = 30;// to avoid reassignment error, we can use "var" instead of "val"

  val c = 10; // val is a read-only variable, which means that it cannot be reassigned after it has been initialized. 
  // c = 20; // error: val cannot be reassigned

  var d = 10; // var is a mutable variable, which means that it can be reassigned after it has been initialized.
  d = 200; // no error: var can be reassigned

  // if(d >= 1 && d <= 100) {
  if(d in 1..100) {
    println("1.var d = $d is between 1 and 100")
  }

  // when statement can also be used as an expression, which means that it can return a value.
  val message = when(d) {
    in 1..100 -> "2.var d = $d is between 1 and 100"
    else -> "2.ELSE: var d = $d is not between 1 and 100"
  }
  println(message)

  // if statement can also be used as an expression, which means that it can return a value.
  val e = if(d in 1..100) {
    "3.var d = $d is between 1 and 100"
  } else {
    "2.ELSE: var d = $d is not between 1 and 100"
  }
  println(e)

  val instruments = listOf("Guitar", "Piano", "Drums", 1, true)
  println(instruments) // [Guitar, Piano, Drums]

  val pets = arrayOf("Dog", "Cat", "Fish")
  println(pets) // [Ljava.lang.String;@1b6d3586
  println(java.util.Arrays.toString(pets)) // [Dog, Cat, Fish]

  // calling a function
  val sum = add(10, 20)
  println("The sum of 10 and 20 is: $sum") // The sum of 10 and 20 is: 30


  // Null Safety
  // "?" is used to declare a nullable variable, which can hold a null value.
  var name: String? = null // nullable variable, can hold null value
  // var name: String = null// non-nullable variable, cannot hold null value, will cause a compile-time error
  println(name) // null
  // "?:", known as the Elvis operator, is used to provide a default value when the variable is null.
  println(name?.length ?: "Name is null") // Name is null

  // "!!" should be used with LOTS of caution
  println(name!!.length) // NullPointerException at runtime, because we are trying to access the length of a null variable without checking for nullability first.

}

// single-expression function
fun add(a: Int, b: Int): Int = a + b

