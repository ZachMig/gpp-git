package com.zmigliorini.gpp;

import java.sql.SQLException;
import java.sql.ResultSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	private final String url = "jdbc:mysql://localhost:3306/gpp";
	private final String username = "admin";
	private final String password = "password";
	
	private DBConn conn = new DBConn(url, username, password);
	
	
	
	/**
	 * 
	 * @param name country name as HTTP GET parameter
	 * 	When provided by client, whitespace should be replaced by underlines 
	 * 	and this method will expect and handle underlines.
	 * @return a Country object for JSON serialization, or NULL if there is 
	 * 	a problem creating the object or locating the record in DB.
	 */
	@GetMapping("/country")
	public Country getCountry(@RequestParam(value="name") String name) { 
		Country country = null;
		ResultSet set = null;
		
		//Replace underlines that client is instructed to use, and trim whitespace.
		name = name.replace("_", " ").trim();
		
		try {
			conn.connectDB();
		} catch (SQLException e) {
			System.err.println("SQLException on db connection attempt.");
			System.err.println("Error Code = " + e.getErrorCode());
			System.err.println("SQL state = " + e.getSQLState());
			System.err.println("Message = " + e.getMessage());
			e.printStackTrace();
		}
		
		try {
			set = conn.queryCountry(name);
		} catch (SQLException e) {
			System.err.println("SQLException on query attempt.");
			System.err.println("Error Code = " + e.getErrorCode());
			System.err.println("SQL state = " + e.getSQLState());
			System.err.println("Message = " + e.getMessage());
			e.printStackTrace();
		}
		
		//Handle null ResultSet by returning null to Jackson parser
		if (set == null) {
			System.err.println("ResultSet null after query. Returning null response");
			return null;
		}
		
		try {
			country = new Country(set);
		} catch (IllegalArgumentException e) {
			System.err.println("Caught IllegalArgumentException when calling constructor Country(ResultSet set).");
			e.printStackTrace();
		}
		
		//If somehow country object still null after constructor
		if (country == null) {
			System.err.println("No exception but Country object still null after constructor call.\n Returning null to Jackson.");
			return null;
		}
		
		return country;
		
	}
	
}
