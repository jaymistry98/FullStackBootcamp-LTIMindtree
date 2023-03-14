package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionInit;

public class InsertDemoWithPrepare {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = ConnectionInit.loadConnection();
		
		// Write the statement
		String insertStatement = "insert into employee values(?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(insertStatement);
		
		stmt.setInt(1, Integer.parseInt(args[0]));
		stmt.setString(2, args[1]);
		stmt.setString(3, args[2]);
		
		// Execute the statement
		
		int data = stmt.executeUpdate();
		if (data > 0) {
			System.out.println("Employee added");
		}
		
		
		
	}

}