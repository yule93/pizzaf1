package hansung.designpatterns.factory.pizzaaf;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
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
		return new FrozenClams();
	}

	public Meat[] createMeat() {
		Meat meat [] = { new Pork(),
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
