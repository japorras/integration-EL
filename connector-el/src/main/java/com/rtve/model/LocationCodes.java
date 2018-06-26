package com.rtve.model;

import java.util.Arrays;

public class LocationCodes {

	private String [] location_codes_ok = new String [] {};
	private String [] location_codes_ko = new String [] {};
	private String [] location_groups_ok = new String [] {};
	private String [] location_groups_ko = new String [] {};
	public String[] getLocation_codes_ok() {
		return location_codes_ok;
	}
	public void setLocation_codes_ok(String[] location_codes_ok) {
		this.location_codes_ok = location_codes_ok;
	}
	public String[] getLocation_codes_ko() {
		return location_codes_ko;
	}
	public void setLocation_codes_ko(String[] location_codes_ko) {
		this.location_codes_ko = location_codes_ko;
	}
	public String[] getLocation_groups_ok() {
		return location_groups_ok;
	}
	public void setLocation_groups_ok(String[] location_groups_ok) {
		this.location_groups_ok = location_groups_ok;
	}
	public String[] getLocation_groups_ko() {
		return location_groups_ko;
	}
	public void setLocation_groups_ko(String[] location_groups_ko) {
		this.location_groups_ko = location_groups_ko;
	}
	
	@Override
	public String toString() {
		return "LocationCodes [location_codes_ok=" + Arrays.toString(location_codes_ok) + ", location_codes_ko="
				+ Arrays.toString(location_codes_ko) + ", location_groups_ok=" + Arrays.toString(location_groups_ok)
				+ ", location_groups_ko=" + Arrays.toString(location_groups_ko) + "]";
	}
	
	
}
