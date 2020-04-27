package com.capg.hcs.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capg.hcs.entity.DiagnosticCenterBean;
import com.capg.hcs.service.HealthCareServiceImpl;



@RestController
public class HealthCareRestController {
	@Autowired
	HealthCareServiceImpl hcsi;
	
	 @GetMapping("/healthcare/delete")
	 public String deleteCenter(@RequestBody DiagnosticCenterBean center) {
			DiagnosticCenterBean dc = hcsi.deleteCenter(center);
			return "Center deleted successfully with id:"+ dc.getCenter_id();
		}
	 
	 
	 @GetMapping("/healthcare/display")      
		public List<DiagnosticCenterBean> displayCenter() {

			List<DiagnosticCenterBean> center = hcsi.displaycenter();
			return  center;
		}


}
