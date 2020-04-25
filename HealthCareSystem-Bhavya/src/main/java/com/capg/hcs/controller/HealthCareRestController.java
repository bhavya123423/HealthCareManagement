package com.capg.hcs.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.capg.hcs.entity.TestBean;
import com.capg.hcs.service.HealthCareServiceImpl;
@RestController
@CrossOrigin("*")
public class HealthCareRestController {
@Autowired 
HealthCareServiceImpl healthservice;

@GetMapping("/tests")
public ResponseEntity<List<TestBean>> findAllTests()
{
	List<TestBean> list=healthservice.findAllTests();
	ResponseEntity<List<TestBean>> rt=new ResponseEntity<>(list,HttpStatus.OK);
    return rt; 
}


@PostMapping("/tests")
public ResponseEntity<TestBean> addTest(@RequestBody TestBean test)
{
 TestBean te=healthservice.addTest(test);
 ResponseEntity<TestBean> re=new ResponseEntity<TestBean>(te,HttpStatus.OK);
return re;
}
}



