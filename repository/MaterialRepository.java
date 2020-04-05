package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ent.mini.erp.model.MaterialMaster;


/**
 * Created by mini erp 2020.
 */
@Repository
public interface MaterialRepository extends MongoRepository<MaterialMaster,String> {

    @Override
    List<MaterialMaster> findAll();           // find all Employee

    @Query(value = "{ 'materialName' : ?0 }")
    List<MaterialMaster> findByMaterialName(String name);       // find Material by name

    @Query(value = "{ 'materialId' : ?0 }")

    @Override
    void delete(String s);              // delete by ID
}