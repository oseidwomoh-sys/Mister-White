class Toyota implements AutomobileAssembler {
  
  public static final String MAKE = "Toyota";

  public Automobile createSedan(String model, int year) {
    return new Sedan(MAKE, model, year);
  }

  public Automobile createSUV(String model, int year) {
    return new Suv(MAKE, model, year);
  }

  public Automobile createTruck(String model, int year) {
    return new Truck(MAKE, model, year);
  }

  @Override
  public Automobile assemble(String type, String model, int year) {
    if (type.equals("Sedan")) {
      return createSedan(model, year);
    } else if (type.equals("SUV")) {
      return createSUV(model, year);
    } else if (type.equals("Truck")) {
      return createTruck(model, year);
    } else {
      throw new IllegalArgumentException("Unknown car type: " + type);
    }
  }
}
