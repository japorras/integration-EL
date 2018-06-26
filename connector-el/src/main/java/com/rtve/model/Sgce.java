package com.rtve.model;

public class Sgce {

	private int sgceId; 
	private String title;
	public int getSgceId() {
		return sgceId;
	}
	public void setSgceId(int sgceId) {
		this.sgceId = sgceId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Sgce [sgceId=" + sgceId + ", title=" + title + "]";
	}
	
	
	
	
}
