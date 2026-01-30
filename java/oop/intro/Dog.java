class Dog extends Animal {

  Dog() {
      System.out.println("A dog is created.");
  }

  @Override
  void eat() {
      System.out.println("The dog is eating.");
  }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

