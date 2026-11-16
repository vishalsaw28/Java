package com.vishal.Singelton;

public class Connection {
	
	private Connection() {
		
	}
	
	private static Connection con = null;
	public static Connection getConnection() {
		if(con == null) {
			con = new Connection();
		}
		return con;
	}

}
