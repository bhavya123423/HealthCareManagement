package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.hcs.dao.HealthCareDaoImpl;
import com.capg.hcs.entity.TestBean;

@Service
public class HealthCareServiceImpl implements IHealthCareService {
@Autowired
HealthCareDaoImpl healthDao;


public List<TestBean> findAllTests() {
		
		return healthDao.findAllTests();
	}
	
public TestBean addTest(TestBean test) {
		
	 return healthDao.addTest(test);
	}

}

