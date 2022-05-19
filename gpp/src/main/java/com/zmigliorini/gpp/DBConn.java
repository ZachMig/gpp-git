package com.zmigliorini.gpp;

import java.sql.*;

/**
 * @author zmigliorini
 *
 */
public class DBConn {
	
	private Connection conn;
	private final String url;// = "jdbc:mysql://localhost:3306/gpp";
	private final String username;// = "admin";
	private final String password;// = "password";
	
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
	
	public DBConn(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	protected void connectDB () throws SQLException {
		conn = DriverManager.getConnection(url, username, password);
	}
	
	/**
	 * 
	 * @param countryName name of the country to retrieve data on
	 * @return ResultSet object of the single record retrieved
	 * @throws SQLException
	 */
	protected ResultSet queryCountry(String countryName) throws SQLException {
		
		ps = conn.prepareStatement(selectQuery);
		ps.setString(1, countryName);
		
		rs = ps.executeQuery();
		
		return rs;
	}
	
	
	/**
	 * 
	 * @param args
	 * Testing only
	 */
	public static void main(String args[]) {
		DBConn dbConn = new DBConn("jdbc:mysql://localhost:3306/gpp", "admin", "password");
		try {
			dbConn.connectDB();
			ResultSet set = dbConn.queryCountry("United States of America");
			ResultSetMetaData rsmd = set.getMetaData();
					
			
			while (set.next()){
				for (int i=1; i<rsmd.getColumnCount(); i++) {
					if (i > 1) System.out.print(",  ");
			        System.out.print(rsmd.getColumnName(i) + ": " + set.getString(i));
				}
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}