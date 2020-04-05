package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.StorageBin;

public interface StorageBinRepository extends MongoRepository<StorageBin,String> {

	List<StorageBin> findByStorageBin(String storageBin);

}