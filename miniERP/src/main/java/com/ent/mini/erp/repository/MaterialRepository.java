package com.ent.mini.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ent.mini.erp.model.Material;

import java.util.List;
import java.util.Optional;


/**
 * Created by mini erp 2020.
 */
@Repository
public interface MaterialRepository extends MongoRepository<Material,String> {

    @Override
    List<Material> findAll();           // find all Employee

    @Query(value = "{ 'materialName' : ?0 }")
    List<Material> findByMaterialName(String name);       // find Material by name

    @Query(value = "{ 'materialId' : ?0 }")
    Optional<Material> findById(String materialId);           // find

    @Override
    void delete(String s);              // delete by ID
}