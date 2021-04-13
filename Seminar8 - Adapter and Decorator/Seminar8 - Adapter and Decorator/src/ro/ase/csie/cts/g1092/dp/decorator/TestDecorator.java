package ro.ase.csie.cts.g1092.dp.decorator;

import ro.ase.csie.cts.g1092.dp.adapter.FantasySuperHero;
import ro.ase.csie.cts.g1092.dp.adapter.SuperHeroCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		 SuperHeroCharacter fantasyHero = new FantasySuperHero("Blue dragon", 1000, true);

	        fantasyHero.move();
	        
	        //the drag should look and behave like a wounded one
	        
	        fantasyHero.takeHit(500);
	        
	        //add a shield/armor to the drag
	        
	        fantasyHero.takeHit(200);

	}

}
