package com.capg.hcs.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.Appointment;
import com.capg.hcs.entity.DiagnosticCenter;
import com.capg.hcs.entity.Test;
import com.capg.hcs.entity.UserBean;
import com.capg.hcs.service.HealthCareServiceImpl;







@RestController

public class HealthCareRestController {
	
	@Autowired
	
	HealthCareServiceImpl serviceimpl;
	
	
	public void getAllAppointments()
	{
		serviceimpl.approveAppointment();
	}
	
	
	
	@RequestMapping(value="/appoinmentlist")
	public static List<Appointment> createList(){
		List<Appointment> list=new ArrayList<>();
		
		DiagnosticCenter diagnosticcenter=new DiagnosticCenter();
    	DiagnosticCenter d2=new DiagnosticCenter();
    	diagnosticcenter.setCenterId("1122");
    	diagnosticcenter.setCenterName("APOLO");
    	diagnosticcenter.setCenterId("3344");
    	diagnosticcenter.setCenterName("KIMS");
    	
    	Test test1=new Test();
    	test1.setTestId("101");
    	test1.setTestName("Blood Group");
    	Test test2=new Test();
    	test2.setTestId("102");
    	test2.setTestName("Blood Pressure");
    	Test test3=new Test();
    	test3.setTestId("102");
    	test3.setTestName("Blood Sugar");
    	
    	diagnosticcenter.setListOfTests(Arrays.asList(test1,test2,test3));
		
    	UserBean user1=new UserBean("101","john","kite",9505411992L,"Cutomer","johnabc@gmail.com");
    	UserBean user2=new UserBean("102","goerge","helo",9059689933L,"Cutomer","george@gmail.com");
    	UserBean user3=new UserBean("103","helly","happy",9999988888L,"Cutomer","helly@gmail.com");
    	
    	Appointment a1=new Appointment();
    	a1.setAppointmentId(10000000001L);
    	a1.setDatetime(new Date(2020,1,20));
    	a1.setTest(test1);
    	a1.setUser(user1);
    	a1.setApproved(false);
    	
    	
    	Appointment a2=new Appointment();
    	a2.setAppointmentId(10000000002L);
    	a2.setDatetime(new Date(2020,1,22));
    	a2.setTest(test2);
    	a2.setUser(user2);
    	a2.setApproved(false);
    	
    	list.add(a1);
    	list.add(a2);
    	
    	return list;
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/appoinmentlist/{approved}") 
	  public void  updateTopic(@RequestBody Appointment appointmentlist,@PathVariable long id) 
	  {
		serviceimpl.approveAppointment();
	  }
	

}
