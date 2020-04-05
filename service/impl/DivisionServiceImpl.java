package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.Division;
import com.ent.mini.erp.repository.DivisionRepository;
import com.ent.mini.erp.service.DivisionService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class DivisionServiceImpl implements DivisionService {

    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    
    @Override
    public void delete(String divisionId) {
    	divisionRepository.delete(divisionRepository.findOne(divisionId));
    }

    @Override
    public Division save(Division division) {
        return divisionRepository.save(division);
    }

    @Override
    public Division update(Division division) {
        return divisionRepository.save(division);
    }

	@Override
	public List<Division> getDivision(String division) {
		return divisionRepository.findByDivision(division);
	}
}