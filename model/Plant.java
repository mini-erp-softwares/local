package com.ent.mini.erp.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "Plant")
public class Plant implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	String plantId;
	String plant;
	String plantDescription;
	CompanyCode companyCode;
	Name name;
	Address address;
	Communication communication;
	List<StorageLocation> storageLocationList;
		
}
