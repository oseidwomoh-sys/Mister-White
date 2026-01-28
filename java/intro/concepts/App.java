// add package name here if needed
//
class App {

  // methods
  // public void isTheValueOfAPositive(int a) {
  public static void isTheValueOfAPositive(int a) {
   // control flow
    if (a > 0) { // the flow of execution is determined by the condition a > 0
      System.out.println("a is positive");
    } else {
      System.out.println("a is not positive");
    }
  }


  public static void main(String[] args) {

    // variables are all about data storage
    byte x = 10; // byte variable 00001010
    int a = 5; // integer variable 00000000000000000000000000000101
    String b = "Hello, World! abc 123"; // string variable
    double c = 3.14;
    boolean d = true;

    // print variables to the console
    System.out.println("Integer: " + a);
    System.out.println("String: " + b); 
    System.out.println("Double: " + c);
    System.out.println("Boolean: " + d);

    // App app = new App(); // create an instance of App to call non-static methods

    a = 1;
    // app.isTheValueOfAPositive(a); // call method to check if a is positive
    isTheValueOfAPositive(a); // call method to check if a is positive

    a = 3;
    // app.isTheValueOfAPositive(a); // call method to check if a is positive
    isTheValueOfAPositive(a); // call method to check if a is positive

    a = -2;
    // app.isTheValueOfAPositive(a); // call method to check if a is positive
    isTheValueOfAPositive(a); // call method to check if a is positive
 
    for (int i = 0; i < 5; i++) { // loop 5 times // the condition i < 5 controls the flow of execution
      System.out.println("Loop iteration: " + i);
    }

    switch (a) { // switch statement to control flow based on the value of a
      case 1:
        System.out.println("a is one");
        break;
      case 5:
        System.out.println("a is five");
        break;
      default:
        System.out.println("a is something else");
        break;
    }

    while (a > 0) { // while loop continues as long as a > 0
      System.out.println("a is still positive: " + a);
      a--; // decrement a
    }

    do { // do-while loop executes at least once
      System.out.println("This will print at least once. a: " + a);
      a++;
    } while (a < 0); // condition checked after execution
    
    
  }
}

