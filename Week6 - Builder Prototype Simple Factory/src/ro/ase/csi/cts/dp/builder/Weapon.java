package ro.ase.csi.cts.dp.builder;

public class Weapon {
	String type;
		
	public Weapon(String type) {
		super();
		this.type = type;
	}

	public void pewPew() {
		System.out.println("Shooting...");
	}
}