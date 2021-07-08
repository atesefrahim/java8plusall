package oop_design.ecommerce;

public class Demo {

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();

    //Product toothBrush = new Product("electric", 123);
    //Product babyMilk = new Product("aptamil", 150);

    Product toothBrush = Catalogue.getProduct("electric");

    cart.addProduct(Catalogue.getProduct("electric"));
    cart.addProduct(Catalogue.getProduct("babyMilk"));

    System.out.println(cart);
    System.out.println(cart.getTotalCost());


    CreditCard creditCard = new CreditCard(123456);

    Customer customer = new Customer("ates", 123456);

  }

}
