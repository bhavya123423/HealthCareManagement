package com.capg.hcs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.hcs.entity.HealthCareBean;
import com.capg.hcs.entity.Tests;
@Repository
@Transactional
public abstract class HealthCareDaoImpl implements IHealthCareDao{
	@PersistenceContext
	EntityManager em;

	public HealthCareBean makeAnAppointment(HealthCareBean bean) {
		em.persist(bean);
		return bean;
	}

	
}
