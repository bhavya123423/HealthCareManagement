package com.capg.hcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.hcs.dao.IHealthCareDao;
import com.capg.hcs.entity.TestBean;

@Service
public class HealthCareServiceImpl implements IHealthCareService {
@Autowired
IHealthCareDao dao;

public TestBean addTest(@RequestBody TestBean bean) {
	
	return dao.addTest(bean);
}


public List<TestBean> displaytest() {
	return dao.displaytest();
}





}
