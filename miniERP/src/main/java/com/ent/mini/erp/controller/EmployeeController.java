package com.ent.mini.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ent.mini.erp.model.Employee;
import com.ent.mini.erp.service.EmployeeService;
/**
 * Created by JavaDeveloperZone 2020.
 */
@RestController     // for rest response
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // to add new employee
    @RequestMapping(value = "save",method = RequestMethod.POST)     // or user @GetMapping
    public Employee save(@RequestBody Employee employee){
    		System.out.println("---"+employee.getEmployeeName());
    		System.out.println("----"+employee.getEmployeeRole());
        return employeeService.save(employee);
    }

    // to update employee
    @RequestMapping(value = "update",method = RequestMethod.POST)     // or user @GetMapping
    public Employee update(Employee employee){
        return employeeService.update(employee);
    }

    // list of all employee
    @RequestMapping(value = "list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Employee> listEmployee() {
        return employeeService.findAll();
    }

    // delete specific employee using employee id
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)        // or use @DeleteMapping
    public void delete(@RequestParam("id")String id){
         employeeService.delete(id);
    }
}

