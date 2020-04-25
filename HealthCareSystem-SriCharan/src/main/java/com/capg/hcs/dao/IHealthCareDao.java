package com.capg.hcs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.hcs.entity.HealthCareBean;

public interface IHealthCareDao extends JpaRepository<HealthCareBean, String>{
 

}
