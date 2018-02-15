package headfirst.strategy;

import headfirst.strategy.behaviors.FlyRocketPowered;
import headfirst.strategy.ducks.DecoyDuck;
import headfirst.strategy.ducks.MallardDuck;
import headfirst.strategy.ducks.ModelDuck;
import headfirst.strategy.ducks.RubberDuck;

public class MAIN_MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();
		DecoyDuck	decoy = new DecoyDuck();
 
		ModelDuck	model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
