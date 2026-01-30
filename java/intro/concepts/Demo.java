import java.util.Scanner;

class Demo {

  public static void main(String[] args) {

    // The high-level view of every program is as follows:
    // 1. Input - get data from a source (keyboard, file, network, etc.)
    // 2. Process - perform computations or manipulations on the data
    // 3. Output - display or store the results

    
    System.out.println("Hello, World!");

    // data can be
    // literal values (like numbers or text) "Hello, World!"
    // variables that store data
    String greeting = "Hello, World!";
    System.out.println(greeting);

    // data will eventually be stored in memory as bits (0s and 1s)
    // So, "Hello, World!" is stored as a sequence of bits in memory
    //
    // We deal with data size by using two types of units: Primitive Data Types and Reference Data Types
    // 
    // So, because data is stored in memory and data can vary in size. 
    // Java uses Primitive Data Types to define fixed sizes for common types of data: 
    // int (integer numbers), double (decimal numbers), char (single characters), boolean (true/false values), etc.
    // Java also uses Reference Data Types for more complex data structures like arrays and objects.
    //
    // Memory is divided in two main areas: Stack and Heap
    //
    // To deal with Input. Java provides the InputStream class for reading data from various sources.
    // For example, to read from the keyboard, we can use System.in which is an InputStream.
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}

