package com.capg.hcs.service;

import java.util.List;

import com.capg.hcs.entity.TestBean;

public interface IHealthCareService {
	

public List<TestBean> findAllTests();
public TestBean addTest(TestBean test);

}