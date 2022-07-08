package com.zmigliorini.gpp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="countries")
public class Country {
	
	public Country () {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="name", length=100)
	private String name;
	
	@Column(name="pop_m")
	private Integer popM;
	
	@Column(name="size_km2")
	private Integer sizeKM2;
	
	@Column(name="birth_rate")
	private Float birthRate;
	
	@Column(name="avg_elevation_meters")
	private Integer avgElevationMeters;
	
	@Column(name="is_landlocked")
	private Boolean isLandlocked;

	@Column(name="gdp_m")
	private Integer gdpM;
	
	@Column(name="import_m")
	private Integer importM;
	
	@Column(name="export_m")
	private Integer exportM;
	
	@Column(name="standing_army_k")
	private Integer standingArmyK;
	
	@Column(name="naval_disp_tons")
	private Integer navalDispTons;
	
	@Column(name="num_warplanes")
	private Integer numWarplanes;
	
	@Column(name="continent")
	private String continent;
	
	@Column(name="religion")
	private String religion;
	
	@Column(name="ethnicity")
	private String ethnicity;
	
	@Column(name="language")
	private String language;
	
	@Column(name="government")
	private String government;
	
	@Column(name="trade_bloc")
	private String tradeBloc;
	
	@Column(name="mil_alliance")
	private String milAlliance;
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPopM(Integer popM) {
		this.popM = popM;
	}
	public void setSizeKM2(Integer sizeKM2) {
		this.sizeKM2 = sizeKM2;
	}
	public void setBirthRate(Float birthRate) {
		this.birthRate = birthRate;
	}
	public void setAvgElevationMeters(Integer avgElevationMeters) {
		this.avgElevationMeters = avgElevationMeters;
	}
	public void setIsLandlocked(Boolean isLandlocked) {
		this.isLandlocked = isLandlocked;
	}
	public void setGdpM(Integer gdpM) {
		this.gdpM = gdpM;
	}
	public void setImportM(Integer importM) {
		this.importM = importM;
	}
	public void setExportM(Integer exportM) {
		this.exportM = exportM;
	}
	public void setStandingArmyK(Integer standingArmyK) {
		this.standingArmyK = standingArmyK;
	}
	public void setNavalDispTons(Integer navalDispTons) {
		this.navalDispTons = navalDispTons;
	}
	public void setNumWarplanes(Integer numWarplanes) {
		this.numWarplanes = numWarplanes;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setGovernment(String government) {
		this.government = government;
	}
	public void setTradeBloc(String tradeBloc) {
		this.tradeBloc = tradeBloc;
	}
	public void setMilAlliance(String milAlliance) {
		this.milAlliance = milAlliance;
	}
		
}
