package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.MaterialGroup;

public interface MaterialGroupRepository extends MongoRepository<MaterialGroup,String> {

	List<MaterialGroup> findByMaterialGroup(String materialGroup);


}
