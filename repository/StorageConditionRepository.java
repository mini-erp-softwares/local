package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.StorageCondition;

public interface StorageConditionRepository extends MongoRepository<StorageCondition,String> {

	List<StorageCondition> findByStorageCondition(String storageCondotion);

}