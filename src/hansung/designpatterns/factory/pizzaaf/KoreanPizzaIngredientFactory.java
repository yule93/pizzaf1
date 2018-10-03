package hansung.designpatterns.factory.pizzaaf;

public class KoreanPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new SoySauce();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new BlackOlives(),
                new Spinach(),
                new Eggplant() };
        return veggies;
    }
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    public Clams createClam() {
        return null;        // 한국 지부에서 조개는 취급하지 않습니다.
    }
    public Meat[] createMeat() {
        Meat meat [] = { new Pork(),
                new BulgogiMeat(),
                new Steak(),
                new Beef()
        };
        return meat;
    }
    public Meat createBulgogi() {
        return new BulgogiMeat();
    }
    public Ricecake createRicecake() {
        return new SlicedRicecake();
    }
}
