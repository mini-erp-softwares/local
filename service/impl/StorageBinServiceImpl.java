package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.StorageBin;
import com.ent.mini.erp.repository.StorageBinRepository;
import com.ent.mini.erp.service.StorageBinService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class StorageBinServiceImpl implements StorageBinService {

    @Autowired
    private StorageBinRepository storageBinRepository;

    @Override
    public List<StorageBin> findAll() {
        return storageBinRepository.findAll();
    }

    
    @Override
    public void delete(String storageBinId) {
    	storageBinRepository.delete(storageBinRepository.findOne(storageBinId));
    }

    @Override
    public StorageBin save(StorageBin storageBin) {
        return storageBinRepository.save(storageBin);
    }

    @Override
    public StorageBin update(StorageBin storageBin) {
        return storageBinRepository.save(storageBin);
    }

	@Override
	public List<StorageBin> getStorageBin(String storageBin) {
		return storageBinRepository.findByStorageBin(storageBin);
	}
}