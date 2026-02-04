class Suv extends Automobile {

  public Suv(String make, String model, int year) {
    super(make, model, year);
    this.doors = 5;
    this.seatsCapacity = 7;
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
