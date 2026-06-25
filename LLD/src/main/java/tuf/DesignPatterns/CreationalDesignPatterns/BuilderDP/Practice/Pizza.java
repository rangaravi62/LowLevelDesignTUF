import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crustType;
    private String cheese;
    private List<String> toppings = new ArrayList<>();
    private boolean extraSauce;

    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.crustType = pizzaBuilder.crustType;;
        this.cheese = pizzaBuilder.cheese;
        this.toppings = pizzaBuilder.toppings;
        this.extraSauce = pizzaBuilder.extraSauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crustType='" + crustType + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                ", extraSauce=" + extraSauce +
                '}';
    }

    public static class PizzaBuilder {

        private String size;
        private String crustType;

        private String cheese = "mozzarella";
        private List<String> toppings = new ArrayList<>();
        private boolean extraSauce;

        public PizzaBuilder(String size, String crustType){
            this.size = size;
            this.crustType = crustType;
        }

        public PizzaBuilder withCheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder addToppings(String topping){
            this.toppings.add(topping);
            return this;
        }

        public PizzaBuilder withExtraSauce(boolean extraSauce){
            this.extraSauce = extraSauce;
            return this;
        }


        public Pizza build(){
            return new Pizza(this);
        }

    }
}


class MainPizza {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder("large","thick").withCheese("parmesan").addToppings("onion").addToppings("paneer").withExtraSauce(true).build();
        System.out.println(pizza);

        Pizza pizza1 = new Pizza.PizzaBuilder("medium","thin").build();
        System.out.println(pizza1);

    }
}
