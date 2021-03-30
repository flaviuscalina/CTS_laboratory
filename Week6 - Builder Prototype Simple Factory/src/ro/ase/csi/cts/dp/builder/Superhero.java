package ro.ase.csi.cts.dp.builder;

public class Superhero {
	String name;
	int lifePoints;
	boolean isVillan;
	boolean isCriticalWounded;
	
	Weapon leftHandWeapon;
	Weapon rightHandWeapon;
	
	String superPower;
	String superSuperPower;
	
	private Superhero() {
		
	}
	
	public Superhero(String name, int lifePoints, boolean isVillan, boolean isCriticalWounded, Weapon leftHandWeapon,
			Weapon rightHandWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillan = isVillan;
		this.isCriticalWounded = isCriticalWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public static class SuperheroBuilder{
		Superhero superhero = null;
		
		public SuperheroBuilder(String name, int lifePoints) {
			
			this.superhero=new Superhero();
			this.superhero.name=name;
			this.superhero.lifePoints=lifePoints;
			
			//this.superhero=new Superhero(name,lifePoints,false, false, null, null, "", "");
			
		}
		
		public SuperheroBuilder isVillan() {
			this.superhero.isVillan= true;
			return this;
		}

		public SuperheroBuilder isWounded() {
			this.superhero.isCriticalWounded=true;
			return this;
		}
		
		public SuperheroBuilder setLeftWeapon(Weapon weapon) {
			this.superhero.leftHandWeapon=weapon;
			return this;
		}
		
		public SuperheroBuilder setRightWeapon(Weapon weapon) {
			this.superhero.rightHandWeapon=weapon;
			return this;
		}
		
		public SuperheroBuilder setSuperPower(String superPower) {
			this.superhero.superPower=superPower;
			return this;
		}
		
		public SuperheroBuilder setSuperSuperPower(String superSuperPower) {
			this.superhero.superSuperPower=superSuperPower;
			return this;
		}
		
		
		public Superhero build() {
			return this.superhero;
		}
		
	}
	
}

