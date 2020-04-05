package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.SalesOrganisation;
import com.ent.mini.erp.repository.SalesOrganisationRepository;
import com.ent.mini.erp.service.SalesOrganisationService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class SalesOrganisationServiceImpl implements SalesOrganisationService {

    @Autowired
    private SalesOrganisationRepository salesOrganisationRepository;

    @Override
    public List<SalesOrganisation> findAll() {
        return salesOrganisationRepository.findAll();
    }

    
    @Override
    public void delete(String salesOrganisationId) {
    	salesOrganisationRepository.delete(salesOrganisationRepository.findOne(salesOrganisationId));
    }

    @Override
    public SalesOrganisation save(SalesOrganisation salesOrganisation) {
        return salesOrganisationRepository.save(salesOrganisation);
    }

    @Override
    public SalesOrganisation update(SalesOrganisation salesOrganisation) {
        return salesOrganisationRepository.save(salesOrganisation);
    }

	@Override
	public List<SalesOrganisation> getSalesOrganisation(String salesOrganisation) {
		return salesOrganisationRepository.findBySalesOrganisation(salesOrganisation);
	}
}