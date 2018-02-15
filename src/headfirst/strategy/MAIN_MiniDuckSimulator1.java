package headfirst.strategy;

import headfirst.strategy.behaviors.FlyRocketPowered;
import headfirst.strategy.ducks.Duck;
import headfirst.strategy.ducks.MallardDuck;
import headfirst.strategy.ducks.ModelDuck;

public class MAIN_MiniDuckSimulator1 {
 
	public static void main(String[] args) {
		// Абстрактный класс
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
