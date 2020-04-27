package com.capg.hcs.service;
import java.util.List;

import com.capg.hcs.entity.DiagnosticCenterBean;

public interface IHealthCareService {
	public DiagnosticCenterBean deleteCenter(DiagnosticCenterBean center);
	public List<DiagnosticCenterBean> displaycenter();
}
