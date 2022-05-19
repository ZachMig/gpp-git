package com.zmigliorini.gpp;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Country {
	
	
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
	
	public Country(ResultSet set) {
		
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
