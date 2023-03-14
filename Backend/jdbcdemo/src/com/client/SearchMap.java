package com.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import com.connection.ConnectionInit;
import com.model.Employee;

public class SearchMap {

	public static void main(String[] args) {
		
		PreparedStatement stmt;
		ResultSet rs = null;
		ArrayList<Employee> al = new ArrayList<Employee>();
		HashMap<Integer, ArrayList<Employee>> hm = new HashMap<Integer, ArrayList<Employee>>();
		
		Connection conn = ConnectionInit.loadConnection();
		try {
			String query = "select * from employee";
			stmt = conn.prepareStatement(query);
			rs = stmt.executeQuery();
			while(rs.next()) {
				Employee em = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3));
				al.add(em);
				hm.put(em.getEmpId(), al);
			}
		}
		catch (Exception e) {}
		System.out.println(hm.get(102));

	}

}
