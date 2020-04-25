package com.capg.hcs.dao;

import java.sql.Date;

import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
import com.capg.hcs.entity.UserBean;



public interface IHealthCareDao {
	
	public String addCenter(DiagnosticCenter center);
	public boolean removeCenter(DiagnosticCenter center);
	public String addTest(Test test);
	public boolean removeTest(Test test);
	public long makeAppointment(UserBean user,DiagnosticCenter center,Test test,Date datetime);
	public String register(UserBean user);
	public boolean approveAppointment();

}
