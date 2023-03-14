package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionInit;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Load the driver
		//Class.forName("com.mysql.jdbc.Driver");
		// Establish the connection
		//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ltidb?serverTimezone=UTC","root","root123");
		Connection conn = ConnectionInit.loadConnection();
		
		// Write the statement
		Statement stmt = conn.createStatement();
		
		// Execute the statement
		String insertStatement = "insert into employee values(101,'admin','newyork')";
		int data = stmt.executeUpdate(insertStatement);
		if (data > 0) {
			System.out.println("Employee added");
		}
		
		
		
	}

}