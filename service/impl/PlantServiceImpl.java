package com.ent.mini.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ent.mini.erp.model.Plant;
import com.ent.mini.erp.repository.PlantRepository;
import com.ent.mini.erp.service.PlantService;

/**
 * Created by mini erp on 2020.
 */

@Service
public class PlantServiceImpl implements PlantService {

    @Autowired
    private PlantRepository plantRepository;


    
    @Override
    public List<Plant> findAll() {
        return plantRepository.findAll();
    }

    
    @Override
    public void delete(String PlantId) {
    	plantRepository.delete(plantRepository.findOne(PlantId));
    }

    @Override
    public Plant save(Plant Plant) {
        return plantRepository.save(Plant);
    }

    @Override
    public Plant update(Plant Plant) {
        return plantRepository.save(Plant);
    }

	@Override
	public List<Plant> getPlant(String plant) {
		return plantRepository.findByPlant(plant);
	}
}