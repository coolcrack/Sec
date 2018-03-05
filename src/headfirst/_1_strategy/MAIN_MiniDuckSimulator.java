package headfirst._1_strategy;

import headfirst._1_strategy.behaviors.FlyRocketPowered;
import headfirst._1_strategy.ducks.DecoyDuck;
import headfirst._1_strategy.ducks.MallardDuck;
import headfirst._1_strategy.ducks.ModelDuck;
import headfirst._1_strategy.ducks.RubberDuck;

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
