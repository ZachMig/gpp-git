package com.zmigliorini.gpp;

import java.sql.SQLException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


@JsonIgnoreProperties(value = {"numColumns"})
public class Country {
	
	//Number of columns a record in gpp.countries table must have
	private final int numColumns = 19;
	
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
			this.name = set.getString(1);
			this.popM = set.getInt(2);
			this.sizeKM2 = set.getInt(3);
			this.birthRate = set.getDouble(4);
			this.avgElevationMeters = set.getInt(5);
			this.isLandlocked = set.getBoolean(6);
			this.gdpM = set.getInt(7);
			this.importM = set.getInt(8);
			this.exportM = set.getInt(9);
			this.standingArmyK = set.getInt(10);
			this.navalDispTons = set.getInt(11);
			this.numWarplanes = set.getInt(12);
			this.continent = set.getString(13);
			this.religion = set.getString(14);
			this.ethnicity = set.getString(15);
			this.language = set.getString(16);
			this.government = set.getString(17);
			this.tradeBloc = set.getString(18);
			this.milAlliance = set.getString(19);
			
		} catch (SQLException e) {
			System.err.println("Caught SQLException in Country(ResultSet set) constructor.");
			System.err.println("Error Code = " + e.getErrorCode());
			System.err.println("SQL state = " + e.getSQLState());
			System.err.println("Message = " + e.getMessage());
			e.printStackTrace();
			throw new IllegalArgumentException("Error attempting to parse ResultSet set in Country constructor");
		}
	}
	
	public Country(String name, int popM, int sizeKM2, double birthRate, int avgElevationMeters,
			boolean isLandlocked, int gdpM, int importM, int exportM, int standingArmyK, int navalDispTons,
			int numWarplanes, String continent, String religion, String ethnicity, String language, String government,
			String tradeBloc, String milAlliance) {
		super();
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
	
	public int getNumColumns() {
		return this.numColumns;
	}

	
	public String getName() {
		return name;
	}


	public int getPopM() {
		return popM;
	}


	public int getSizeKM2() {
		return sizeKM2;
	}


	public double getBirthRate() {
		return birthRate;
	}


	public int getAvgElevationMeters() {
		return avgElevationMeters;
	}


	public boolean getIsLandlocked() {
		return isLandlocked;
	}


	public int getGdpM() {
		return gdpM;
	}


	public int getImportM() {
		return importM;
	}


	public int getExportM() {
		return exportM;
	}


	public int getStandingArmyK() {
		return standingArmyK;
	}


	public int getNavalDispTons() {
		return navalDispTons;
	}


	public int getNumWarplanes() {
		return numWarplanes;
	}


	public String getContinent() {
		return continent;
	}


	public String getReligion() {
		return religion;
	}


	public String getEthnicity() {
		return ethnicity;
	}


	public String getLanguage() {
		return language;
	}


	public String getGovernment() {
		return government;
	}


	public String getTradeBloc() {
		return tradeBloc;
	}


	public String getMilAlliance() {
		return milAlliance;
	}

	
}
