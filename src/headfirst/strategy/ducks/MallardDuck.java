package headfirst.strategy.ducks;

import headfirst.strategy.behaviors.FlyWithWings;
import headfirst.strategy.behaviors.Quack;

public class MallardDuck extends Duck {

	// В конструкторе определяем свойства
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
