package com.ent.mini.erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.MaterialMaster;
import com.ent.mini.erp.repository.MaterialRepository;
import com.ent.mini.erp.service.MaterialService;

import java.util.List;
import java.util.Optional;

/**
 * Created by mini erp on 2020.
 */


//@CacheConfig(cacheNames = {"material"})
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;


    @Cacheable
    @Override
    public List<MaterialMaster> findAll() {
        return materialRepository.findAll();
    }

    @Cacheable
    @Override
    public void delete(String materialId) {
    		materialRepository.delete(materialRepository.findOne(materialId));
    }

    @Override
    public MaterialMaster save(MaterialMaster material) {
        return materialRepository.save(material);
    }

    @Override
    public MaterialMaster update(MaterialMaster material) {
        return materialRepository.save(material);
    }

	@Override
	public List<MaterialMaster> getMaterial(String name) {
		return materialRepository.findByMaterialName(name);
	}
}