package com.capg.hcs.service;

import java.util.Date;

import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
import com.capg.hcs.entity.UserBean;

public interface IHealthCareService {
	
	public String addCenterService(DiagnosticCenter center);
	public boolean removeCenterService(DiagnosticCenter center);
	public String addTestService(Test test);
	public boolean removeTestService(Test test);
	public long makeAppointmentService(UserBean user,DiagnosticCenter center,Test test,Date datetime);
	public String registerService(UserBean user);
	public boolean approveAppointment();

}
