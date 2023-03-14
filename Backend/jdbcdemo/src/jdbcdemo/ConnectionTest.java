package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.connection.ConnectionInit;

public class ConnectionTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection conn = ConnectionInit.loadConnection();
		System.out.println("connected....");
		
	}

}
