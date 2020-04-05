package com.ent.mini.erp.controller;

import java.net.HttpURLConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ent.mini.erp.model.StorageBin;
import com.ent.mini.erp.model.ExceptionModel;
import com.ent.mini.erp.model.constants.ApiRequestConstants;
import com.ent.mini.erp.service.StorageBinService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Created by MiniErp 2020.
 */
@RequestMapping("storageBin/")
@RestController     // for rest response
public class StorageBinController {
	
	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger(StorageBinController.class);

    /** The storageBin service. */
    @Autowired
    private StorageBinService storageBinService;

    /**
     * Save.
     *
     * @param plant the storageBin
     * @return the storageBin
     */
    // to add new material
    @ApiOperation(value = "save storageBin", httpMethod = "POST")
    @ApiResponses(value = {
    		@ApiResponse(code = HttpURLConnection.HTTP_OK, message = "The request has been successfully processed.", response = StorageBin.class),
    		@ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized", response = ExceptionModel.class),
    		@ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found", response = ExceptionModel.class),
    		@ApiResponse(code = HttpURLConnection.HTTP_FORBIDDEN, message = "Access denied", response = ExceptionModel.class),
    		@ApiResponse(code = 200, message = "The request has been successfully processed and teh validation response is sent to client as required.", response=StorageBin.class),
    		@ApiResponse(code = 202, message = "The request has been accepted and the validation response is sent to the client as required.", response=StorageBin.class)
    })
    @PostMapping(path = "save", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public StorageBin save(
    		@RequestHeader(name=ApiRequestConstants.ORIGIN_NAME, required=true) @ApiParam(required=true, allowEmptyValue=false, type = "string", value="Source of origin") String originName,
    		@RequestHeader(name=ApiRequestConstants.APPLICATION_NAME, required=true) @ApiParam(required=true, allowEmptyValue=false, type = "string", value="Source of origin") String applicationName,
    		@RequestHeader(name=ApiRequestConstants.PROCESS_NAME, required=true) @ApiParam(required=true, allowEmptyValue=false, type = "string", value="Source of origin") String processName,
    		@RequestBody StorageBin plant){
    	logger.info("Saving StorageBin code");
        return storageBinService.save(plant);
    }

    /**
     * Update.
     *
     * @param plant the storageBin
     * @return the storageBin
     */
    // to update employee
    @RequestMapping(value = "update",method = RequestMethod.POST)     // or user @GetMapping
    public StorageBin update(StorageBin plant){
    	logger.info("Update plant ");
        return storageBinService.update(plant);
    }

    /**
     * List employee.
     *
     * @return the java.util. list
     */
    // list of all employee
    @RequestMapping(value = "list",method = RequestMethod.GET)   // or use @GetMapping
    public java.util.List<StorageBin> listplant() {
    	logger.info("getting List of StorageBin");
        return storageBinService.findAll();
    }

    /**
     * Delete.
     *
     * @param id the id
     */
    // delete specific employee using employee id
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)        // or use @DeleteMapping
    public void delete(@RequestParam("id")String id){
    	logger.info("Delete StorageBin ");
    		storageBinService.delete(id);
    }
}

