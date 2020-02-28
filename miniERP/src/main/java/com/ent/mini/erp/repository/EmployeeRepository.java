package com.ent.mini.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ent.mini.erp.model.Employee;

import java.util.List;


/**
 * Created by mini erp on 03-08-2017.
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {

    @Override
    List<Employee> findAll();           // find all Employee

    @Query(value = "{ 'employeeName' : ?0 }")
    List<Employee> findByEmployeeName(String name);       // find employee by name

    Employee findByEmployeeId(String id);           // find

    @Override
    void delete(String s);              // delete by ID
}