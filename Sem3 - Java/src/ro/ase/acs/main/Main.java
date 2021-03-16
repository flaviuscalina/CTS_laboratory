package ro.ase.acs.main;
import ro.ase.acs.classes.Car;
import ro.ase.acs.classes.Vehicle;
import  ro.ase.acs.interfaces.Taxable;
public class Main {

	public static void main(String[] args) {
		Taxable t = new Car("Ford", "Puma", 90, 900);
		Vehicle v = new Car("Dacia", "Logan", 50, 1200);
		
		float tax= t.computeTax();
		System.out.println("Tax: " + tax);
		
		v.start();
		
		
		String s1 = "abcd";
		String s2= "abcd";
		
		if(s1.equals(s2)) {
			System.out.println("They are the same");
		}
	}

}
