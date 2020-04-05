package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class Dimension implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String grossWeight;
	String weightUnit;		
	String netWeight;							
	String volume;
	String volumUnit;		
	String EAN_UPC;
	String EANCategory;		
	String industryStandardDescription;
	Boolean dangerousGoods;		

}
