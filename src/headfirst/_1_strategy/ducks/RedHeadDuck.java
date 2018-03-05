package headfirst._1_strategy.ducks;

import headfirst._1_strategy.behaviors.FlyWithWings;
import headfirst._1_strategy.behaviors.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
