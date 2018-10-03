package hansung.designpatterns.factory.pizzaaf;

public class RicecakePizza extends Pizza {
    public RicecakePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        ricecake = ingredientFactory.createRicecake();
    }
}
