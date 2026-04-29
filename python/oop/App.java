// In java: the class is how we describe an object, and the object is an instance of a class.
class App {

  // attributes/members/fields/properties
  String name;
  int age; // default value is 0
  // constructor
  public App() {
    this.name = "Default App";
    int = 10;
  }

  public App(String name) {
    this.name = name;
    int x = 10; // local variable, not an attribute of the class 
    age = 20; // this is the same as "this.age = 20;", but since there is no local variable named "age", we can omit "this."

    // In python: "this" is "self", in java: "this" is used to refer to the current object instance.
    //
    // "Duck Typing"
  }

  public App(String name, int version) {
    this.name = name + " v" + version;
  }


  public void run() {
    System.out.println("Running " + name);
  }

  public static void main(String[] args) {

    // the object itself is the instance of the class
    App myApp = new App("My Application", 1);
    System.out.println("Application Name: " + myApp.name);

    myApp.run();
    
  }

  // strongly typed language:
  // we need to specify the type of the variable, 
  // and the type of the parameter in the method signature.
  public void animalSpeak(Animal animal) {
    animal.speak();
  }
}

public interface Animal {
  void speak();
}

public class Dog implements Animal {
  public void speak() {
    System.out.println("Woof!");
  }
}

public class Cat implements Animal {
  public void speak() {
    System.out.println("Meow!");
  }
}

