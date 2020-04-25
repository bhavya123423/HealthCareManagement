package com.capg.hcs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity

@Table(name="center_table")
public class DiagnosticCenterBean {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="centerid",nullable=false)
	private String centerId;
	
	@Column(name="centername",nullable=false)
	private String centerName;
	
	@OneToMany(mappedBy="diagnosticcenter")
	@JsonIgnore
	private List<TestBean> listOfTests=new ArrayList<>();

	public DiagnosticCenterBean() {
		super();
	}
		public DiagnosticCenterBean(String centerName, String centerId, List<TestBean> listOfTests) {
			super();
			this.centerName = centerName;
			this.centerId = centerId;
			this.listOfTests = listOfTests;
		
	}
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
	public List<TestBean> getListOfTests() {
		return listOfTests;
	}
	public void setListOfTests(List<TestBean> listOfTests) {
		this.listOfTests = listOfTests;
	}
	
}

