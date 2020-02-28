package com.ent.mini.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ent.mini.erp.model.Material;

import java.util.List;


/**
 * Created by mini erp 2020.
 */
@Repository
public interface MaterialRepository extends MongoRepository<Material,String> {

    @Override
    List<Material> findAll();           // find all Employee

    @Query(value = "{ 'materialName' : ?0 }")
    List<Material> findByMaterialName(String name);       // find Material by name

    Material findByMaterialId(String id);           // find

    @Override
    void delete(String s);              // delete by ID
}