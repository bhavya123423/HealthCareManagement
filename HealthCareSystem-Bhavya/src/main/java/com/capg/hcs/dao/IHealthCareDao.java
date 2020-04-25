package com.capg.hcs.dao;

import java.util.List;

import com.capg.hcs.entity.TestBean;

public interface IHealthCareDao {
	
	public List<TestBean> findAllTests();
	public TestBean addTest(TestBean test);
}
