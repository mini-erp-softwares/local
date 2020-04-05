package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.TemparatureCondition;

public interface TemparatureConditionRepository extends MongoRepository<TemparatureCondition,String> {

	List<TemparatureCondition> findByTemparatureCondition(String storageCondotion);

}