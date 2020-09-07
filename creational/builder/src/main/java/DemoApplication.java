/*
Builder pattern is useful for avoiding complex constructors and setter methods.
It is also useful for creating instances with immutable fields.

The code for generating the instance is easy to read.
*/

public class DemoApplication {

  public static void main(String[] args) {

    Pizza pizza =
        new Pizza.PizzaBuilder()
            .size(PizzaSize.GIANT)
            .crustStyle(PizzaCrustStyle.THIN)
            .addIngredient("SALAMI")
            .addIngredient("PEPPERONI")
            .addIngredient("OLIVE")
            .addIngredient("MUSHROOM")
            .addIngredient("TOMATO")
            .addIngredient("ONION")
            .build();

    pizza.print();
  }
}
