package com.ent.mini.erp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ent.mini.erp.model.MaterialMaster;
import com.ent.mini.erp.service.MaterialService;
/**
 * Created by JavaDeveloperZone 2020.
 */
@Controller
@RestController     // for rest response
public class MaterialController {
	
	private static final Logger logger = LogManager.getLogger(MaterialController.class);

    @Autowired
    private MaterialService materialService;

    // to add new material
    @RequestMapping(value = "material/save",method = RequestMethod.POST)     // or user @GetMapping
    public MaterialMaster save(@RequestBody MaterialMaster material){
    	logger.info("Save Material");
        return materialService.save(material);
    }

    // to update employee
    @RequestMapping(value = "material/update",method = RequestMethod.POST)     // or user @GetMapping
    public MaterialMaster update(MaterialMaster material){
        return materialService.update(material);
    }

    // list of all employee
    @RequestMapping(value = "material/list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<MaterialMaster> listEmployee() {
        return materialService.findAll();
    }

    // delete specific employee using employee id
    @RequestMapping(value = "material/delete", method = RequestMethod.DELETE)        // or use @DeleteMapping
    public void delete(@RequestParam("id")String id){
    		materialService.delete(id);
    }
}

