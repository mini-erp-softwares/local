package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.CompanyCode;
import com.ent.mini.erp.repository.CompanyCodeRepository;
import com.ent.mini.erp.service.CompanyCodeService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class CompanyCodeServiceImpl implements CompanyCodeService {

    @Autowired
    private CompanyCodeRepository companyCodeRepository;


    
    @Override
    public List<CompanyCode> findAll() {
        return companyCodeRepository.findAll();
    }

    
    @Override
    public void delete(String companyCodeId) {
    	companyCodeRepository.delete(companyCodeRepository.findOne(companyCodeId));
    }

    @Override
    public CompanyCode save(CompanyCode companyCode) {
        return companyCodeRepository.save(companyCode);
    }

    @Override
    public CompanyCode update(CompanyCode companyCode) {
        return companyCodeRepository.save(companyCode);
    }

	@Override
	public List<CompanyCode> getCompanyCode(String name) {
		return companyCodeRepository.findByCompanyCodeName(name);
	}
}