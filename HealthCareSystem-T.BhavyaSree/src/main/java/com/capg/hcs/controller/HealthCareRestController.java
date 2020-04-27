package com.capg.hcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.hcs.entity.TestBean;
import com.capg.hcs.service.HealthCareServiceImpl;
@CrossOrigin(origins = "http://localhost:4440")
@RestController
@RequestMapping(path="/healthcare")
public class HealthCareRestController {
@Autowired
HealthCareServiceImpl hcsi;
//http://localhost:8068/healthcare/create
// POSTMAN (Post : body{ "test_name": "ent", "center_name": "yashoda"}
@PostMapping(path="/create")       //postman :POST
public String addTest(@RequestBody TestBean bean) {
	TestBean tb=hcsi.addTest(bean);
	return "Test added successfully with testid\t"+tb.getTest_id()+"\tin center\t"+tb.getCenter_name();
}
@GetMapping(path= "/show")     //GET:http://localhost:8068/healthcare/show    
public List<TestBean> displaytest()
{
	List<TestBean> bean=hcsi.displaytest();
	return bean;
}

}
