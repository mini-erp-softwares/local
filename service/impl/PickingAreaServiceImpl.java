package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.PickingArea;
import com.ent.mini.erp.repository.PickingAreaRepository;
import com.ent.mini.erp.service.PickingAreaService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class PickingAreaServiceImpl implements PickingAreaService {

    @Autowired
    private PickingAreaRepository pickingAreaRepository;


    
    @Override
    public List<PickingArea> findAll() {
        return pickingAreaRepository.findAll();
    }

    
    @Override
    public void delete(String PickingAreaId) {
    	pickingAreaRepository.delete(pickingAreaRepository.findOne(PickingAreaId));
    }

    @Override
    public PickingArea save(PickingArea PickingArea) {
        return pickingAreaRepository.save(PickingArea);
    }

    @Override
    public PickingArea update(PickingArea PickingArea) {
        return pickingAreaRepository.save(PickingArea);
    }

	@Override
	public List<PickingArea> getPickingArea(String pickingArea) {
		return pickingAreaRepository.findByPickingArea(pickingArea);
	}
}