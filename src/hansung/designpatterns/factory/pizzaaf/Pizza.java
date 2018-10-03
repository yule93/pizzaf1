package hansung.designpatterns.factory.pizzaaf;


public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	Meat meat[];
	Meat bulgogi;
	Ricecake ricecake;

	PizzaIngredientFactory ingredientFactory;
	
	public Pizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (dough != null) {
			result.append("\t");
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append("\t");
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append("\t");
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			result.append("\t");
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append("\t");
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append("\t");
			result.append(pepperoni);
			result.append("\n");
		}
		if (meat != null) {		// 고기라는 토핑이 존재한다면
			result.append("\t");
			for (int i = 0; i < meat.length; i++) {
				result.append(meat[i]);		// 각 지역 특색에 맞게 토핑된 고기 이름 출력
				if (i < meat.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (ricecake != null) {		// 떡이라는 토핑이 존재한다면
			result.append("\t");
			result.append(ricecake);	// 잘린 떡 출력
			result.append("\n");
		}
		if (bulgogi != null) {		// 불고기라는 토핑이 존재한다면
			result.append("\t");
			result.append(bulgogi);		// 불고기 출력
			result.append("\n");
		}
		return result.toString();
	}
}
