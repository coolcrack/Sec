package headfirst.factory.pizzafm;

public abstract class PizzaStore {
	// Здесь уже существуют Виды PizzaStore поэтому переносим в abstract создание - createPizza реализуется в наследниках
	// Это и есть фабричный метод
	abstract Pizza createPizza(String item);
	
	// Используется в main
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
