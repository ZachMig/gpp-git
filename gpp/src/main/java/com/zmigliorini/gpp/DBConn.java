package com.zmigliorini.gpp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author zmigliorini
 * Class to handle connecting to MySQL database and executing queries.
 * @deprecated this code is no longer used as the project has been updated.
 */
public class DBConn {
	
	private Connection conn;
	private final String url;
	private final String username;
	private final String password;
	
	private String selectQuery = "SELECT C.name, C.pop_m, C.size_km2, C.birth_rate, C.avg_elevation_meters, C.is_landlocked, "
			+ "C.gdp_m, C.import_m, C.export_m, C.standing_army_k, C.naval_disp_tons, C.num_warplanes, "
			+ "continents.name as continent, "
			+ "religions.name as religion, "
			+ "ethnicities.name as ethnicity, "
			+ "languages.name as language, "
			+ "governments.name as government, "
			+ "trade_bloc.name as trade_bloc, "
			+ "mil_alliances.name as mil_alliance "
			+ "FROM "
			+ "countries as C "
			+ "LEFT JOIN continents ON C.continentID = continents.id "
			+ "LEFT JOIN religions ON C.religionID = religions.id "
			+ "LEFT JOIN ethnicities ON C.ethnicityID = ethnicities.id "
			+ "LEFT JOIN languages ON C.langID = languages.id "
			+ "LEFT JOIN governments ON C.governmentID = governments.id "
			+ "LEFT JOIN trade_bloc ON C.trade_blocID = trade_bloc.id "
			+ "LEFT JOIN mil_alliances ON C.mil_allianceID = mil_alliances.id "
			+ "WHERE C.name = ?";
	
	private ResultSet rs;
	private PreparedStatement ps;
	
	/**
	 * 
	 * @param url the url of the database
	 * @param username username for database access
	 * @param password password for database access
	 * @deprecated
	 */
	public DBConn(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Attempt to connect to the MySQL database
	 * @throws SQLException
	 * @deprecated
	 */
	protected void connectDB () throws SQLException {
		conn = DriverManager.getConnection(url, username, password);
	}
	
	/**
	 * Run a SELECT query given a country name and return a ResultSet object containing the header
	 * 	and a single record from table gpp.countries
	 * @param countryName name of the country to retrieve data on
	 * @return ResultSet object of the single record retrieved
	 * @throws SQLException
	 * @deprecated
	 */
	protected ResultSet queryCountry(String countryName) throws SQLException {
		
		ps = conn.prepareStatement(selectQuery);
		ps.setString(1, countryName);
		
		rs = ps.executeQuery();
		
		return rs;
	}
	
}