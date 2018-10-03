package hansung.designpatterns.factory.pizzaaf;


public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		PizzaStore koreanStore = new KoreanPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = koreanStore.orderPizza("bulgogi");
		System.out.println("Minjoo ordered a " + pizza + "\n");

		pizza = koreanStore.orderPizza("ricecake");
		System.out.println("Chulsu ordered a " + pizza + "\n");

		pizza = chicagoStore.orderPizza("meat");
		System.out.println("Michael ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("meat");
		System.out.println("Cici ordered a " + pizza + "\n");

		/*pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza + "\n");*/
	}
}
