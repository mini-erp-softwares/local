package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ent.mini.erp.model.SalesOrganisation;

public interface SalesOrganisationRepository extends MongoRepository<SalesOrganisation,String> {

	List<SalesOrganisation> findBySalesOrganisation(String salesOrganisation);

}
