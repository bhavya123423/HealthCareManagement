package com.capg.hcs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity

@Table(name="test_table")
public class TestBean {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid",strategy="uuid")
	@Column(name="testid",nullable=false) 
	private String testId;
	
	@Column(name="testname",nullable=false)
	private String testName;
	
	@ManyToOne
	@JoinColumn(name="centerid",referencedColumnName = "center", 
            insertable = true, updatable = false)
	private DiagnosticCenterBean diagnosticcenter;
	public TestBean() {
		super();
	}
	
	public TestBean(String testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((testId == null) ? 0 : testId.hashCode());
		result = prime * result + ((testName == null) ? 0 : testName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestBean other = (TestBean) obj;
		if (testId == null) {
			if (other.testId != null)
				return false;
		} else if (!testId.equals(other.testId))
			return false;
		if (testName == null) {
			if (other.testName != null)
				return false;
		} else if (!testName.equals(other.testName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + "]";
	}
	
}





