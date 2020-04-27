package com.capg.hcs.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
import com.capg.hcs.entity.UserBean;

@Service
public class HealthCareServiceImpl implements IHealthCareService {

	@Autowired
	IHealthCareDao dao;
	
	@Override
	public String addCenterService(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeCenterService(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String addTestService(Test test) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeTestService(Test test) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long makeAppointmentService(UserBean user, DiagnosticCenter center, Test test, Date datetime) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String registerService(UserBean user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveAppointment() {
		// TODO Auto-generated method stub
		return dao.approveAppointment();
	}
	

}
