package ro.ase.csie.cts.lab5.dp.singleton;

public class DbConnection {
	String socket;
	String schema;
	
	private static DbConnection dbConnection = null;
	
	
	static {
		System.out.println("Loading db conection string");
	}
	
	public DbConnection() {
		System.out.println("Creating a DB Connection");
	}

	private DbConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}
	
	
	
	
}
