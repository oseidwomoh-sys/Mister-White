import java.util.Scanner;

class App {

  public int divide(int a, int b) throws ArithmeticException { // we declare that this method can throw an ArithmeticException, which is a checked exception, so the caller must handle it
    try {
      int result = a / b;
      System.out.println("Result: " + result);
      return result;
    } catch (ArithmeticException e) {
      // throw new RuntimeException("Please don't divide by zero!'");
      System.out.println("EXCEPTION " + e.getMessage());
      throw e; // rethrow the exception to be handled by the caller, in this case, the main method will terminate and print the stack trace
      // System.out.println("Division by zero is not allowed. Please try again.");
    } finally {
      System.out.println("This block will always be executed, regardless of whether an exception is thrown or not.");

      // DO NOT EVER RETURN A VALUE IN THE FINALLY BLOCK, BECAUSE IT WILL OVERRIDE ANY RETURN VALUE FROM THE TRY OR CATCH BLOCKS, 
      // AND IT WILL ALSO OVERRIDE ANY EXCEPTION THAT IS THROWN IN THE TRY OR CATCH BLOCKS, WHICH CAN LEAD TO UNEXPECTED BEHAVIOR 
      // AND MAKE IT HARD TO DEBUG THE CODE.
      // return 355;
    }
    // return 0; // return a default value if an exception occurs
  }

  public static void main(String[] args) {

    // To deal with files, we must first talk about Exception Handling.
    //
    // In Java, an Exception is an event that disrupts the normal flow of instructions.
    // When an exception occurs, the normal flow of the program is interrupted and the 
    // program may terminate if the exception is not handled properly.

    App app0 = new App();
    int x = app0.divide(10, 0); // this will work fine and print the result
    System.out.println("Value of x: " + x); // this will print 3, because the finally block will always be executed and return 3, even if an exception is thrown


    // Scanner scanner = new Scanner(System.in);
    try(Scanner scanner = new Scanner(System.in)) { // try with resources, it will automatically close the resource after the try block is executed
      System.out.print("Divide 10 by: ");
      int divisor = Integer.parseInt(scanner.nextLine());
      // int divisor = scanner.nextInt();
      // int result = 10 / divisor;
      App app = new App();
      int result = app.divide(10, divisor);
      System.out.println("Result: " + result);
    // } catch (NumberFormatException e) { // we caught the exception and handled it
      // System.out.println("Invalid input. Please enter a valid integer."); 
    // } catch (ArithmeticException e) { // we caught the exception and handled it
      // System.out.println("Division by zero is not allowed. Please try again.");
    } catch (Exception e) { // we caught the exception and handled it
      System.out.println("An error occurred: " + e.getMessage());
      // throw e; // rethrow the exception to be handled by the caller, in this case, the main method will terminate and print the stack trace
    // } finally {
      // use to close any resources that we opened in the try block, such as files or scanners
      // scanner.close();
    }
   
    System.out.println("Congratulations! You have successfully completed the program without any exceptions.");
    System.out.println("End of program.");
  }
}

