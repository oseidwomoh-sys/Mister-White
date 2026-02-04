class Sedan extends Automobile {

  public Sedan(String make, String model, int year) {
    super(make, model, year);
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
