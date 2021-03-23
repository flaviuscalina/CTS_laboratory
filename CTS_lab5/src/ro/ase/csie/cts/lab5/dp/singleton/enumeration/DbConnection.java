package ro.ase.csie.cts.lab5.dp.singleton.enumeration;

//implement the singleton as an enumeration
//"Singleton enum"
public enum DbConnection {
Instance;
	
	private DbConnection() {
        System.out.println("Enum implementation");
    }
}
