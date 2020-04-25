package com.capg.hcs.entity;

import java.util.List;

public class DiagnosticCenter {
	private String centerName;
	private String centerId;
	private List<Tests> listOfTest;
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCenterId() {
		return centerId;
	}
	public void setCenterId(String centerId) {
		this.centerId = centerId;
	}
	public List<Tests> getListOfTest() {
		return listOfTest;
	}
	public void setListOfTest(List<Tests> listOfTest) {
		this.listOfTest = listOfTest;
	}
	@Override
	public String toString() {
		return "DiagnosticCenter [centerName=" + centerName + ", centerId=" + centerId + ", listOfTest=" + listOfTest
				+ "]";
	}
	
	
}
