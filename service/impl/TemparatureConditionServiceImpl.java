package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.TemparatureCondition;
import com.ent.mini.erp.repository.TemparatureConditionRepository;
import com.ent.mini.erp.service.TemparatureConditionService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class TemparatureConditionServiceImpl implements TemparatureConditionService {

    @Autowired
    private TemparatureConditionRepository temparatureConditionRepository;

    @Override
    public List<TemparatureCondition> findAll() {
        return temparatureConditionRepository.findAll();
    }

    
    @Override
    public void delete(String temparatureConditionId) {
    	temparatureConditionRepository.delete(temparatureConditionRepository.findOne(temparatureConditionId));
    }

    @Override
    public TemparatureCondition save(TemparatureCondition temparatureCondition) {
        return temparatureConditionRepository.save(temparatureCondition);
    }

    @Override
    public TemparatureCondition update(TemparatureCondition temparatureCondition) {
        return temparatureConditionRepository.save(temparatureCondition);
    }

	@Override
	public List<TemparatureCondition> getTemparatureCondition(String temparatureCondition) {
		return temparatureConditionRepository.findByTemparatureCondition(temparatureCondition);
	}
}