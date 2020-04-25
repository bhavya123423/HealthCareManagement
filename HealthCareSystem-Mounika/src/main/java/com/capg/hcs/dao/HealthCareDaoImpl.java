package com.capg.hcs.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.capg.hcs.entity.DiagnosticCenterBean;
@Repository
@Transactional

public class HealthCareDaoImpl implements IHealthCareDao {
	@PersistenceContext
	 EntityManager entitymanager;
	@Override
	public DiagnosticCenterBean deleteCenter(DiagnosticCenterBean center) {
		 entitymanager.remove(center);
		 return null;
		 
	}
	@Override
	public List<DiagnosticCenterBean> displaycenter() {	
	TypedQuery<DiagnosticCenterBean> query = em.createQuery("from DiagnosticCenterBean", DiagnosticCenterBean.class);
			return query.getResultList();
	}


}
