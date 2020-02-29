package com.ent.mini.erp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.Material;
import com.ent.mini.erp.repository.MaterialRepository;
import com.ent.mini.erp.service.MaterialService;

import java.util.List;

/**
 * Created by mini erp on 2020.
 */


@CacheConfig(cacheNames = {"material"})
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;


    @Cacheable
    @Override
    public List<Material> findAll() {
        return materialRepository.findAll();
    }

    @Cacheable
    @Override
    public void delete(String materialId) {
    		materialRepository.delete(materialRepository.findOne(materialId));
    }

    @Override
    public Material save(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public Material update(Material material) {
        return materialRepository.save(material);
    }
}