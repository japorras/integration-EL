package com.rtve.model;

public class Season {
	
	private int seasonId; 
	private String title;
	
	public int getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Season [seasonId=" + seasonId + ", title=" + title + "]";
	}
	
	
	
}
