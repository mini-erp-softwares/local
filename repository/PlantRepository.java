package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ent.mini.erp.model.Plant;

public interface PlantRepository extends MongoRepository<Plant,String> {

    @Override
    List<Plant> findAll();           // find all Employee

    @Query(value = "{ 'plant' : ?0 }")
    List<Plant> findByPlant(String plant);       // find Material by name

    @Query(value = "{ 'plantId' : ?0 }")
    @Override
    void delete(String s);              // delete by ID

}
