package headfirst._1_strategy;

import headfirst._1_strategy.behaviors.FlyRocketPowered;
import headfirst._1_strategy.ducks.Duck;
import headfirst._1_strategy.ducks.MallardDuck;
import headfirst._1_strategy.ducks.ModelDuck;

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
