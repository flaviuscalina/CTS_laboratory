package ro.ase.csie.cts.dp.simplefactory;

public class SuperHero {
	
	String name;
	AbstractWeapon weapon;
	
	
	
	public SuperHero(String name) {
		super();
		this.name = name;
	}
	
	
	
	public AbstractWeapon getWeapon() {
		return weapon;
	}
	
	public void setWeapon(AbstractWeapon weapon) {
		this.weapon = weapon;
	}
	
}
