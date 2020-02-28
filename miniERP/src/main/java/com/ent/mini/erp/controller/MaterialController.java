package com.ent.mini.erp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ent.mini.erp.ApplicationMiniERP;
import com.ent.mini.erp.model.Employee;
import com.ent.mini.erp.model.Material;
import com.ent.mini.erp.service.EmployeeService;
import com.ent.mini.erp.service.MaterialService;
/**
 * Created by JavaDeveloperZone 2020.
 */
@RestController     // for rest response
public class MaterialController {
	
	private static final Logger logger = LogManager.getLogger(MaterialController.class);

    @Autowired
    private MaterialService materialService;

    // to add new material
    @RequestMapping(value = "material/save",method = RequestMethod.POST)     // or user @GetMapping
    public Material save(@RequestBody Material material){
    		logger.info("---"+material.getMaterialName());
    		logger.info("----"+material.getMaterialDescription());
        return materialService.save(material);
    }

    // to update employee
    @RequestMapping(value = "material/update",method = RequestMethod.POST)     // or user @GetMapping
    public Material update(Material material){
        return materialService.update(material);
    }

    // list of all employee
    @RequestMapping(value = "material/list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<Material> listEmployee() {
        return materialService.findAll();
    }

    // delete specific employee using employee id
    @RequestMapping(value = "material/delete", method = RequestMethod.DELETE)        // or use @DeleteMapping
    public void delete(@RequestParam("id")String id){
    		materialService.delete(id);
    }
}

