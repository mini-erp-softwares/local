package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ent.mini.erp.model.Division;

@Repository
public interface DivisionRepository extends MongoRepository<Division,String> {

	List<Division> findAll();

	Division findOne(String divisionId);

	Division save(Division division);

	void delete(Division findOne);

	List<Division> findByDivision(String division);

}
