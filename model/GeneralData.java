package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class GeneralData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String materialType;
	String materialGroup;
	String bseunitOfMeasure;
	Division division;		
	String generalItemCategoryGroup;							
	
}
