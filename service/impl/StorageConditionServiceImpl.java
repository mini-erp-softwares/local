package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.StorageCondition;
import com.ent.mini.erp.repository.StorageConditionRepository;
import com.ent.mini.erp.service.StorageConditionService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class StorageConditionServiceImpl implements StorageConditionService {

    @Autowired
    private StorageConditionRepository storageConditionRepository;

    @Override
    public List<StorageCondition> findAll() {
        return storageConditionRepository.findAll();
    }

    
    @Override
    public void delete(String storageConditionId) {
    	storageConditionRepository.delete(storageConditionRepository.findOne(storageConditionId));
    }

    @Override
    public StorageCondition save(StorageCondition storageCondition) {
        return storageConditionRepository.save(storageCondition);
    }

    @Override
    public StorageCondition update(StorageCondition storageCondition) {
        return storageConditionRepository.save(storageCondition);
    }

	@Override
	public List<StorageCondition> getStorageCondition(String storageCondition) {
		return storageConditionRepository.findByStorageCondition(storageCondition);
	}
}