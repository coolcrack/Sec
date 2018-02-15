package headfirst.strategy.ducks;

import headfirst.strategy.behaviors.FlyNoWay;
import headfirst.strategy.behaviors.MuteQuack;

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
