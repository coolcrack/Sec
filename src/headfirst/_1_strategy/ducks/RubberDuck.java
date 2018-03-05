package headfirst._1_strategy.ducks;

import headfirst._1_strategy.behaviors.FlyNoWay;
import headfirst._1_strategy.behaviors.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
