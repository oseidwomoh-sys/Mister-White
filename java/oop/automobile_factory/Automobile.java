abstract class Automobile {
  protected String make;
  protected String model;
  protected int year;

  protected int doors;
  protected String engineType;
  protected int wheels;
  protected String seatsMaterial;
  protected int seatsCapacity;
  protected String windowsType;

  public Automobile(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;

    // default values
    this.doors = 4;
    this.engineType = "Gasoline";
    this.wheels = 4;
    this.seatsMaterial = "Fabric";
    this.seatsCapacity = 5;
    this.windowsType = "Electric";
  }

  public Automobile(String make, String model, int year, int doors, String engineType, int wheels, String seatsMaterial, int seatsCapacity, String windowsType) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.doors = doors;
    this.engineType = engineType;
    this.wheels = wheels;
    this.seatsMaterial = seatsMaterial;
    this.seatsCapacity = seatsCapacity;
    this.windowsType = windowsType;
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  // getters for other parts
  public int getDoors() {
    return doors;
  }

  public String getEngineType() {
    return engineType;
  }

  public int getWheels() {
    return wheels;
  }

  public String getSeatsMaterial() {
    return seatsMaterial;
  }

  public int getSeatsCapacity() {
    return seatsCapacity;
  }

  public String getWindowsType() {
    return windowsType;
  }

  public abstract void startEngine();

  public abstract void stopEngine();

  public abstract void honkHorn();

  public String toString() {
    return year + " " + make + " " + model + " [Doors: " + doors + ", Engine: " + engineType + ", Wheels: " + wheels + ", Seats: " + seatsCapacity + " (" + seatsMaterial + "), Windows: " + windowsType + "]";
  }
}
