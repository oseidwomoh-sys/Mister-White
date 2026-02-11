class MealPlan extends PaymentMethod {

  @Override
  public void processPayment(double amount) {
    System.out.println("Processing meal plan payment of $" + amount);
  }
}

