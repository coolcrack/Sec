package headfirst._1_strategy.ducks;

import headfirst._1_strategy.behaviors.FlyNoWay;
import headfirst._1_strategy.behaviors.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		// Определение поведения через класс имплементированный от интерфейса
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
