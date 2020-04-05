package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.SerialProfile;

public interface SerialProfileRepository extends MongoRepository<SerialProfile,String> {

	List<SerialProfile> findBySerialProfile(String serialProfile);

}
