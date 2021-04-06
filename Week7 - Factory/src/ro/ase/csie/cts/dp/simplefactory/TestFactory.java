package ro.ase.csie.cts.dp.simplefactory;

public class TestFactory {

	public static void main(String[] args) {

		SuperHero superman= new SuperHero("Superman");
		superman.setWeapon(new Bazooka("Boom"));
		superman.setWeapon(new MachineGun("MG", 50, 100));
		
		
		AbstractWeapon bazooka= WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Boom");
		superman.setWeapon(bazooka);
		superman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
		
	}

}
