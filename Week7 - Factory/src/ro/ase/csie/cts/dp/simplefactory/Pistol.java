package ro.ase.csie.cts.dp.simplefactory;

public class Pistol extends AbstractWeapon{
	
	public Pistol(String desc, int power) {
		
	super();
	this.description=desc;
	this.powerLevel=power;
	}
	
	@Override
	public void pewPew() {
		System.out.println("Pew Pew -> ->");
		
	}

}
