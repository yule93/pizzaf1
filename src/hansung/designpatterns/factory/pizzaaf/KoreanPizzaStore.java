package hansung.designpatterns.factory.pizzaaf;

public class KoreanPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new KoreanPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Korea Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Korea Style Veggie Pizza");

        } else if (item.equals("bulgogi")) {
            pizza = new BulgogiPizza(ingredientFactory);
            pizza.setName("Korea Style Bulgogi Pizza");

        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Korea Style Pepperoni Pizza");
        }
        else if(item.equals("ricecake")) {
            pizza = new RicecakePizza(ingredientFactory);
            pizza.setName("Korea Style RiceCake Pizza");
        }
        return pizza;
    }
}
