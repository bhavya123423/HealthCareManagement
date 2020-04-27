package com.capg.hcs.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.HealthCareDaoImpl;
import com.capg.hcs.entity.HealthCareBean;




@Service
public abstract  class  HealthCareServiceImpl implements IHealthCareService  {
	
   @Autowired
   HealthCareDaoImpl dao;
   
   public HealthCareBean makeAnAppointment(HealthCareBean bean)  {
	return dao.makeAnAppointment(bean) ;
	   
   }
}
