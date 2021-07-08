package oop_design.ecommerce;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {

  private static Map<String, Product> productMap = new HashMap<>();

  static{
    productMap.put("electric", new Product("electricity", 330));
    productMap.put("babyMilk", new Product("babyMilk", 123));
  }

  public static Product getProduct(String productName) {

    return productMap.get(productName);

  }
}
