package com.capg.hcs.dao;





import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capg.hcs.controller.HealthCareRestController;
import com.capg.hcs.entity.Appointment;
import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
import com.capg.hcs.entity.UserBean;

@Repository

public class HealthCareDaoImpl implements IHealthCareDao {
	
	@Autowired
	HealthCareRestController controller;
	
	
	

	@Override
	public boolean approveAppointment() {
		List newlist=new ArrayList();
		newlist.add(controller.createList());
		
		for(int i=0; i<=newlist.size(); i++) {
			newlist.get(i);
			
			
		}
		
		return false;
	}




	@Override
	public String addCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean removeCenter(DiagnosticCenter center) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public String addTest(Test test) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public boolean removeTest(Test test) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public long makeAppointment(UserBean user, DiagnosticCenter center, Test test, Date datetime) {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	public String register(UserBean user) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
