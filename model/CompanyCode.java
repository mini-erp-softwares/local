package com.ent.mini.erp.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "CompanyCode")
public class CompanyCode implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	@Id    
	String companyCodeId;
	String companyCodeName;
	String companyCodeDesc;						
	String city;
	String currency;
	String language; 		
	String title;										
	Name name;
	Address address;
	Communication communication;
	
}
