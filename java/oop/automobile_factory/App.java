// add package name here if needed
//
class App {

  public static void main(String[] args) {

    // Car Factory Simulation

    // Cars have many parts. Doors, Engine, Windows, Seats, Wheels etc.
    //
    // Cars come in different types like Sedan, SUV, Truck etc.
    //
    // Each type of car has different specifications for each part. 
    //
    // Car company has multiple models for each type of car.
    
    AutomobileFactory factory = AutomobileFactory.getInstance();

    Automobile car1 = factory.assemble("Ford", "Sedan", "Fusion", 2020);
    car1.startEngine();
    car1.honkHorn();
    car1.stopEngine();
    System.out.println(car1);

    Automobile car2 = factory.assemble("Ford", "SUV", "Explorer", 2021);
    car2.startEngine();
    car2.honkHorn();
    car2.stopEngine();
    System.out.println(car2);

    Automobile car3 = factory.assemble("Ford", "Truck", "F-150", 2019);
    car3.startEngine();
    car3.honkHorn();
    car3.stopEngine();
    System.out.println(car3);

    Automobile car4 = factory.assemble("Toyota", "Sedan", "Camry", 2022);
    car4.startEngine();
    car4.honkHorn();
    car4.stopEngine();
    System.out.println(car4);
  }
}

