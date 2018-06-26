package com.rtve.model;

public class Asset {
	
	private int assetId; 
	private String title;
	
	
	public int getAssetId() {
		return assetId;
	}
	public void setAssetId(int assetId) {
		this.assetId = assetId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", title=" + title + "]";
	}

	
	
}
