class AutomobileFactory {
  // Singleton pattern implementation
  private static AutomobileFactory instance;

  private AutomobileFactory() {
    // Private constructor to prevent instantiation
  }

  public static synchronized AutomobileFactory getInstance() {
    if (instance == null) {
      instance = new AutomobileFactory();
    }
    return instance;
  }

  public Automobile assemble(String make, String type, String model, int year) {
    AutomobileAssembler assembler = null;
    switch (make) {
      case "Ford":
        assembler = new Ford();
        break;
      case "Toyota":
        assembler = new Toyota();
        break;
      // Add more manufacturers as needed
      default:
        throw new IllegalArgumentException("Unknown manufacturer: " + make);
    }

    if (assembler != null) {
      return assembler.assemble(type, model, year);
    } else {
      throw new IllegalArgumentException("Assembler not implemented for manufacturer: " + make);
    }
  }
}
