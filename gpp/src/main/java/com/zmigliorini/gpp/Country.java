package com.zmigliorini.gpp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name="continentID", insertable=false, updatable=false)
	private Continent continent;
	
	@ManyToOne
	@JoinColumn(name="religionID", insertable=false, updatable=false)
	private Religion religion;
	
	@ManyToOne
	@JoinColumn(name="ethnicityID", insertable=false, updatable=false)
	private Ethnicity ethnicity;;
	
	@ManyToOne
	@JoinColumn(name="languageID", insertable=false, updatable=false)
	private Language language;
	
	@ManyToOne
	@JoinColumn(name="governmentID", insertable=false, updatable=false)
	private Government government;
	
	@ManyToOne
	@JoinColumn(name="trade_blocID", insertable=false, updatable=false)
	private TradeBloc tradeBloc;
	
	@ManyToOne
	@JoinColumn(name="allianceID", insertable=false, updatable=false)
	private Alliance alliance;
	
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
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	public void setEthnicity(Ethnicity ethnicity) {
		this.ethnicity = ethnicity;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public void setGovernment(Government government) {
		this.government = government;
	}
	public void setTradeBloc(TradeBloc tradeBloc) {
		this.tradeBloc = tradeBloc;
	}
	public void setMilAlliance(Alliance alliance) {
		this.alliance = alliance;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getPopM() {
		return popM;
	}
	public Integer getSizeKM2() {
		return sizeKM2;
	}
	public Float getBirthRate() {
		return birthRate;
	}
	public Integer getAvgElevationMeters() {
		return avgElevationMeters;
	}
	public Boolean getIsLandlocked() {
		return isLandlocked;
	}
	public Integer getGdpM() {
		return gdpM;
	}
	public Integer getImportM() {
		return importM;
	}
	public Integer getExportM() {
		return exportM;
	}
	public Integer getStandingArmyK() {
		return standingArmyK;
	}
	public Integer getNavalDispTons() {
		return navalDispTons;
	}
	public Integer getNumWarplanes() {
		return numWarplanes;
	}
	public Continent getContinent() {
		return continent;
	}
	public Religion getReligion() {
		return religion;
	}
	public Ethnicity getEthnicity() {
		return ethnicity;
	}
	public Language getLanguage() {
		return language;
	}
	public Government getGovernment() {
		return government;
	}
	public TradeBloc getTradeBloc() {
		return tradeBloc;
	}
	public Alliance getAlliance() {
		return alliance;
	}
	
	
	
}
