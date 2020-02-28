package com.ent.mini.erp.service;

import java.util.List;

import com.ent.mini.erp.model.Employee;

/**
 * Created by JavaDeveloperZone on 04-04-2018.
 */

public interface EmployeeService {
    List<Employee> findAll();
    Employee save(Employee employee);
    void delete(String employeeId);
    Employee update(Employee employee);
}