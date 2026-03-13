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

  val message = when(d) {
    in 1..100 -> "2.var d = $d is between 1 and 100"
    else -> "2.ELSE: var d = $d is not between 1 and 100"
  }
  println(message)

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

}
