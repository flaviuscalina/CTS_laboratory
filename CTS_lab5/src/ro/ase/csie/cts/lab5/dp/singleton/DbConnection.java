package ro.ase.csie.cts.lab5.dp.singleton;

public class DbConnection {
	String socket;
	String schema;
	
	//version1-eager
	//private static DbConnecton dbConnection = new DbConnection();
	
	//version2- lazy aproach
	private static DbConnection dbConnection = null;
	
	
	
	//class static initializer
	// uses the class lazy-loading aproach
	static {
		System.out.println("Loading db conection string");
	}
	
	//constructor initializer
	
	{
		//executed before each construcor call
		System.out.println("Init Connection String");
	}
	
	public DbConnection() {
		System.out.println("Creating a DB Connection");
		
		//access a local settings file to get credentials and conn string
		
	}

	private DbConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}
	
	// the method used to return the reference to the unique object
	public static DbConnection getDbConnection() {
		if(DbConnection.dbConnection==null) {
			dbConnection=new DbConnection();
		}
		return DbConnection.dbConnection;
	}
	
	
	
	
	
	
	
	
}
