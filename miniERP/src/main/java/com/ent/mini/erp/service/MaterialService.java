package com.ent.mini.erp.service;

import java.util.List;

import com.ent.mini.erp.model.Material;

/**
 * Created by JavaDeveloperZone on 04-04-2018.
 */

public interface MaterialService {
    List<Material> findAll();
    Material save(Material material);
    void delete(String materialId);
    Material update(Material material);
}