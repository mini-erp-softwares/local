package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.MaterialGroup;
import com.ent.mini.erp.repository.MaterialGroupRepository;
import com.ent.mini.erp.service.MaterialGroupService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class MaterialGroupServiceImpl implements MaterialGroupService {

    @Autowired
    private MaterialGroupRepository materialGroupRepository;

    @Override
    public List<MaterialGroup> findAll() {
        return materialGroupRepository.findAll();
    }

    
    @Override
    public void delete(String materialGroupId) {
    	materialGroupRepository.delete(materialGroupRepository.findOne(materialGroupId));
    }

    @Override
    public MaterialGroup save(MaterialGroup materialGroup) {
        return materialGroupRepository.save(materialGroup);
    }

    @Override
    public MaterialGroup update(MaterialGroup materialGroup) {
        return materialGroupRepository.save(materialGroup);
    }

	@Override
	public List<MaterialGroup> getMaterialGroup(String materialGroup) {
		return materialGroupRepository.findByMaterialGroup(materialGroup);
	}
}