package com.capg.hcs.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity

@Table(name="center_table")
public class HealthCareBean {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private User user;
	private DiagnosticCenter center;
	private Tests test;
	private Date date;

}
	