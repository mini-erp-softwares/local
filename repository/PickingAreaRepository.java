package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.PickingArea;

public interface PickingAreaRepository extends MongoRepository<PickingArea,String> {

	List<PickingArea> findByPickingArea(String pickingArea);

}
