package headfirst._4_factory._1_pizzas;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	// Сразу в main при создании определяем
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// Создание экземпляра в фабрике
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
