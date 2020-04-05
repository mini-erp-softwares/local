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
@Document(collection = "Division")
public class Division implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	String divisionId;
	String division;				
	String description;			
	
}
