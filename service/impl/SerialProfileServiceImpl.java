package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.SerialProfile;
import com.ent.mini.erp.repository.SerialProfileRepository;
import com.ent.mini.erp.service.SerialProfileService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class SerialProfileServiceImpl implements SerialProfileService {

    @Autowired
    private SerialProfileRepository serialProfileRepository;

    @Override
    public List<SerialProfile> findAll() {
        return serialProfileRepository.findAll();
    }

    
    @Override
    public void delete(String serialProfileId) {
    	serialProfileRepository.delete(serialProfileRepository.findOne(serialProfileId));
    }

    @Override
    public SerialProfile save(SerialProfile serialProfile) {
        return serialProfileRepository.save(serialProfile);
    }

    @Override
    public SerialProfile update(SerialProfile serialProfile) {
        return serialProfileRepository.save(serialProfile);
    }

	@Override
	public List<SerialProfile> getSerialProfile(String serialProfile) {
		return serialProfileRepository.findBySerialProfile(serialProfile);
	}
}