package com.zmigliorini.gpp;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Country {
	
	//Number of columns a record in gpp.countries table must have
	private final int numColumns = 20;
	
	private final int id;
	private final String name;
	private final int popM;
	private final int sizeKM2;
	private final double birthRate;
	private final int avgElevationMeters;
	private final boolean isLandlocked;
	private final int gdpM;
	private final int importM;
	private final int exportM;
	private final int standingArmyK;
	private final int navalDispTons;
	private final int numWarplanes;
	private final String continent;
	private final String religion;
	private final String ethnicity;
	private final String language;
	private final String government;
	private final String tradeBloc;
	private final String milAlliance;
	
	/**
	 * 
	 * @param set A non-null ResultSet object consisting of a header and one record representing a country 
	 * 	from 'countries' table in 'gpp' database. 
	 */
	public Country(ResultSet set) throws IllegalArgumentException {
		try {
			set.next(); //Skip the header
			ResultSetMetaData rsmd = set.getMetaData();
			
			//Confirm correct number of columns in set, throw IllegalArgumentException otherwise
			if (rsmd.getColumnCount() != this.numColumns) {
				throw new IllegalArgumentException("ResultSet object contains " + rsmd.getColumnCount() 
					+ " number of columns, Country constructor expecting " + this.numColumns + " number of columns.");
			}
			
			//set is valid, instantiate Country object
			this.id = set.getInt(1);
			this.name = set.getString(2);
			this.popM = set.getInt(3);
			this.sizeKM2 = set.getInt(4);
			this.birthRate = set.getDouble(5);
			this.avgElevationMeters = set.getInt(6);
			this.isLandlocked = set.getBoolean(7);
			this.gdpM = set.getInt(8);
			this.importM = set.getInt(9);
			this.exportM = set.getInt(10);
			this.standingArmyK = set.getInt(11);
			this.navalDispTons = set.getInt(12);
			this.numWarplanes = set.getInt(13);
			this.continent = set.getString(14);
			this.religion = set.getString(15);
			this.ethnicity = set.getString(16);
			this.language = set.getString(17);
			this.government = set.getString(18);
			this.tradeBloc = set.getString(19);
			this.milAlliance = set.getString(20);
			
		} catch (SQLException e) {
			System.err.println("Caught SQLException in Country(ResultSet set) constructor.");
			System.err.println("Error Code = " + e.getErrorCode());
			System.err.println("SQL state = " + e.getSQLState());
			System.err.println("Message = " + e.getMessage());
			e.printStackTrace();
			throw new IllegalArgumentException("Error attempting to parse ResultSet set in Country constructor");
		}
	}
	
	public Country(int id, String name, int popM, int sizeKM2, double birthRate, int avgElevationMeters,
			boolean isLandlocked, int gdpM, int importM, int exportM, int standingArmyK, int navalDispTons,
			int numWarplanes, String continent, String religion, String ethnicity, String language, String government,
			String tradeBloc, String milAlliance) {
		super();
		this.id = id;
		this.name = name;
		this.popM = popM;
		this.sizeKM2 = sizeKM2;
		this.birthRate = birthRate;
		this.avgElevationMeters = avgElevationMeters;
		this.isLandlocked = isLandlocked;
		this.gdpM = gdpM;
		this.importM = importM;
		this.exportM = exportM;
		this.standingArmyK = standingArmyK;
		this.navalDispTons = navalDispTons;
		this.numWarplanes = numWarplanes;
		this.continent = continent;
		this.religion = religion;
		this.ethnicity = ethnicity;
		this.language = language;
		this.government = government;
		this.tradeBloc = tradeBloc;
		this.milAlliance = milAlliance;
	}
	
	protected int getNumColumns() {
		return this.numColumns;
	}
	
	protected int getId() {
		return id;
	}


	protected String getName() {
		return name;
	}


	protected int getPopM() {
		return popM;
	}


	protected int getSizeKM2() {
		return sizeKM2;
	}


	protected double getBirthRate() {
		return birthRate;
	}


	protected int getAvgElevationMeters() {
		return avgElevationMeters;
	}


	protected boolean isLandlocked() {
		return isLandlocked;
	}


	protected int getGdpM() {
		return gdpM;
	}


	protected int getImportM() {
		return importM;
	}


	protected int getExportM() {
		return exportM;
	}


	protected int getStandingArmyK() {
		return standingArmyK;
	}


	protected int getNavalDispTons() {
		return navalDispTons;
	}


	protected int getNumWarplanes() {
		return numWarplanes;
	}


	protected String getContinent() {
		return continent;
	}


	protected String getReligion() {
		return religion;
	}


	protected String getEthnicity() {
		return ethnicity;
	}


	protected String getLanguage() {
		return language;
	}


	protected String getGovernment() {
		return government;
	}


	protected String getTradeBloc() {
		return tradeBloc;
	}


	protected String getMilAlliance() {
		return milAlliance;
	}



	
}
