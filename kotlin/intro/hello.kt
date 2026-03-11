fun main() {

  // operators
  //
  // + - * / % ++ --

  val a = 1.0 + 1 // kotlin can infer the type of a variable, therefore we don't need to provide a variable type. 
  // int a = 1 + 1 // java is strongly typed language, therefore we need to provide a variable type.
  println(a) // 2
  println(a::class.simpleName)

}
