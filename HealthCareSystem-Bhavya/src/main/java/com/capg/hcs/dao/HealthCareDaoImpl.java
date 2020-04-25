package com.capg.hcs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capg.hcs.entity.TestBean;

@Repository
@Transactional
public class HealthCareDaoImpl implements IHealthCareDao {
@PersistenceContext
EntityManager em;
	

	public List<TestBean> findAllTests() 
	{
		TypedQuery<TestBean> query=em.createQuery("from TestBean", TestBean.class);
	    return query.getResultList();
	}

	public TestBean addTest(TestBean test)
	{
		em.persist(test);
		return test;
		
	}
}



