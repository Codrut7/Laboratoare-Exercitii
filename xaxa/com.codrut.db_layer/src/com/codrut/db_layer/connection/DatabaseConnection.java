package com.codrut.db_layer.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
	
	 private static DatabaseConnection instance = null;
	 private Connection connection;
	 private final String url = "jdbc:mysql://localhost:3306/pacanele?autoReconnect=true&useSSL=false";
	 private final String username = "root";
	 private final String password = "root";

	 private DatabaseConnection() throws SQLException, ClassNotFoundException {
         this.connection = DriverManager.getConnection(url+"&user="+username+"&password="+password);
 	}

 	public Connection getConnection(){
	 	return this.connection;
 	}

 	public static DatabaseConnection getInstance() throws java.sql.SQLException, ClassNotFoundException{
     	if(instance==null){
         	instance = new DatabaseConnection();
     	}else if(instance.getConnection().isClosed()){
         	instance = new DatabaseConnection();
     	}
     	return instance;
 	}
}
