package headfirst.strategy.ducks;

import headfirst.strategy.behaviors.FlyBehavior;
import headfirst.strategy.behaviors.QuackBehavior;

public abstract class Duck {
	// Экземпляры интерфейса
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
 
	public Duck() {
	}
 
	// Определеем в наследниках!!! DecoyDuck
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
 
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
 
	abstract void display();
 
	public void performFly() {
		flyBehavior.fly();
	}
 
	public void performQuack() {
		quackBehavior.quack();
	}
 
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}
