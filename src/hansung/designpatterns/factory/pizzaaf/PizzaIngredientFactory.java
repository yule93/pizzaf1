package hansung.designpatterns.factory.pizzaaf;


public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	public Meat[] createMeat();		// 추가된 토핑 종류1
	public Meat createBulgogi();	// 추가된 토핑 종류2
 	public Ricecake createRicecake();		// 추가된 토핑 종류3
}
