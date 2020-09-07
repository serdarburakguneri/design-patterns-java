import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private final PizzaSize size;
  private final PizzaCrustStyle crustStyle;
  private final List<String> ingredients;

  private Pizza(PizzaBuilder pizzaBuilder) {
    size = pizzaBuilder.size;
    crustStyle = pizzaBuilder.crustStyle;
    ingredients = new ArrayList<>(pizzaBuilder.ingredients);
  }

  public void print() {
    System.out.println(
        MessageFormat.format(
            "A {0} {1} pizza with {2} ", size, crustStyle, String.join(",", ingredients)));
  }

  public static class PizzaBuilder {
    private PizzaSize size;
    private PizzaCrustStyle crustStyle;
    private List<String> ingredients = new ArrayList<>();

    public PizzaBuilder size(PizzaSize size) {
      this.size = size;
      return this;
    }

    public PizzaBuilder crustStyle(PizzaCrustStyle crustStyle) {
      this.crustStyle = crustStyle;
      return this;
    }

    public PizzaBuilder addIngredient(String ingredient) {
      this.ingredients.add(ingredient);
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }
  }
}
