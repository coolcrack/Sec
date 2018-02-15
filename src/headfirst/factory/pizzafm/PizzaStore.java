package headfirst.factory.pizzafm;

public abstract class PizzaStore {
	// ����� ��� ���������� ���� PizzaStore ������� ��������� � abstract �������� - createPizza ����������� � �����������
	// ��� � ���� ��������� �����
	abstract Pizza createPizza(String item);
	
	// ������������ � main
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
