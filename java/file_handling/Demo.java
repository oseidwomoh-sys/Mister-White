import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Demo {

  public static void main(String[] args) {

    // Reading Files: Option 1 - Using Scanner 
    try(Scanner scanner = new File("input.txt")) { // try-with-resources, closes the scanner automatically
      while(scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Reading Files: Option 2 - BufferedReader
    try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
      String line;
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Writing Files: Option 1 - Using PrintWriter
    try(PrintWriter writer = new PrintWriter(new File("output.txt"))) {
      writer.println("Hello, World!");
      writer.println("This is a demo of file writing.");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Writing Files: Option 2 - FileWriter
    try(FileWriter writer = new FileWriter("output.txt")) {
      writer.write("Hello, World!\n");
      writer.write("This is a demo of file writing.\n");
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
}

