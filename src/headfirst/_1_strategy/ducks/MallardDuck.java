package headfirst._1_strategy.ducks;

import headfirst._1_strategy.behaviors.FlyWithWings;
import headfirst._1_strategy.behaviors.Quack;

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
