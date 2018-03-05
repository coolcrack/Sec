package headfirst._4_factory._2_pizzafm;

public class ChicagoStyleCheesePizza extends Pizza {
	// Создается в factory method класса ChicagoPizzaStore который наследуется из PizzaStore
	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}
	// Переопеределяем, так как для 
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
