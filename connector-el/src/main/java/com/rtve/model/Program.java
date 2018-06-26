package com.rtve.model;

public class Program {
	
	
	private int programId; 
	private String title;
	
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Program [programId=" + programId + ", title=" + title + "]";
	}
	
	
	
	
	
}
