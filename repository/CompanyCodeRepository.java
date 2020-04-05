package com.ent.mini.erp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ent.mini.erp.model.CompanyCode;


/**
 * Created by mini erp 2020.
 */
@Repository
public interface CompanyCodeRepository extends MongoRepository<CompanyCode,String> {

    @Override
    List<CompanyCode> findAll();           // find all Employee

    @Query(value = "{ 'companyCodeName' : ?0 }")
    List<CompanyCode> findByCompanyCodeName(String name);       // find Material by name

    @Query(value = "{ 'companyCodeId' : ?0 }")
    @Override
    void delete(String s);              // delete by ID

}