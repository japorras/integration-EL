package com.rtve.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Rule {
	

	private String id_rule;
	
	private LocationCodes location_codes;
	

	private Program program;

	private Season season;

	private Asset asset;

	private Sgce sgce;
	
	private Timestamp publish_date;
	
	private Timestamp init_date;
	
	private Timestamp end_date;
	
	private int interval;
	
	
	public String getId_rule() {
		return id_rule;
	}
	public void setId_rule(String id_rule) {
		this.id_rule = id_rule;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Sgce getSgce() {
		return sgce;
	}
	public void setSgce(Sgce sgce) {
		this.sgce = sgce;
	}
	public LocationCodes getLocation_codes() {
		return location_codes;
	}
	public void setLocation_codes(LocationCodes location_codes) {
		this.location_codes = location_codes;
	}
	
	public Timestamp getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(Timestamp publish_date) {
		this.publish_date = publish_date;
	}
	public Timestamp getInit_date() {
		return init_date;
	}
	public void setInit_date(Timestamp init_date) {
		this.init_date = init_date;
	}
	public Timestamp getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Timestamp end_date) {
		this.end_date = end_date;
	}
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	@Override
	public String toString() {
		return "Rule [id_rule=" + id_rule + ", location_codes=" + location_codes + ", program=" + program + ", season="
				+ season + ", asset=" + asset + ", sgce=" + sgce + ", publish_date=" + publish_date + ", init_date="
				+ init_date + ", end_date=" + end_date + ", interval=" + interval + "]";
	}
	
	
	
}
