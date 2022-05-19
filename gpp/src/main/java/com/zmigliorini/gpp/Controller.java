package com.zmigliorini.gpp;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//feature/1

@RestController
public class Controller {
	
	private final String url = "jdbc:mysql://localhost:3306/gpp";
	private final String username = "admin";
	private final String password = "password";
	
	private DBConn conn = new DBConn(url, username, password);
	
	@GetMapping("/country")
	public Country getCountry(@RequestParam(value="name") String name) { 
		
		ResultSet set = null;
		
		try {
			conn.connectDB();
		} catch (SQLException e) {
			System.err.println("SQLException on db connection attempt.");
			e.printStackTrace();
		}
		
		try {
			set = conn.queryCountry(name);
		} catch (SQLException e) {
			System.err.println("SQLException on query attempt.");
			e.printStackTrace();
		}
		
		//Handle null ResultSet by returning null to Jackson parser
		if (set == null) {
			System.err.println("ResultSet null after query. Returning null response");
			return null;
		}
		
		Country country = new Country(set);
		
//		try {
//			ResultSetMetaData rsmd = set.getMetaData();
//			
//		} catch (SQLException e) {
//			System.err.println("SQLException on ResultSet parsing.");
//			e.printStackTrace();
//		}
		
		
		
		return null;
		
	}
	
}
