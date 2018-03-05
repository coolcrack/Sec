package headfirst._1_strategy.ducks;

import headfirst._1_strategy.behaviors.FlyNoWay;
import headfirst._1_strategy.behaviors.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
