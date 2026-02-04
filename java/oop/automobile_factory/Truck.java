class Truck extends Automobile {
  
  public Truck(String make, String model, int year) {
    super(make, model, year);
    this.doors = 2;
    this.wheels = 6;
    this.seatsCapacity = 3;
    this.windowsType = "Manual";
  }

  @Override
  public void startEngine() {
    System.out.println("Starting engine of " + getMake() + " " + getModel());
  }

  @Override
  public void stopEngine() {
    System.out.println("Stopping engine of " + getMake() + " " + getModel());
  }

  @Override
  public void honkHorn() {
    System.out.println("Honking horn of " + getMake() + " " + getModel());
  }
}
