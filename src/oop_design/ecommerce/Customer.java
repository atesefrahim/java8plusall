package oop_design.ecommerce;

public class Customer {

  private final String name;
  private CreditCard creditCard;

  public Customer(String name, long creditCard) {
    this.name = name;
    this.creditCard = new CreditCard(creditCard);
  }

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        ", creditCard=" + creditCard +
        '}';
  }
}
