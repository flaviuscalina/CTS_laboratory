package ro.ase.csie.cts.dp.simplefactory;

public class MachineGun extends AbstractWeapon{

	
	int noBullets;

	public MachineGun(String desc,int power, int ammo) {
		this.description=desc;
		this.noBullets=ammo;
		this.powerLevel=power;
	}
	
	
	@Override
	public void pewPew() {
		System.out.println("Tac Tac Tac ----------->");
		
	}

}
