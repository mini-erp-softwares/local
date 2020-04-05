package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Address implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	String houseNumber;				
	String street;			
	String district;	
	String city;				
	String region;				
	String country;												
	String pOBox;		
	String postalCode;
	
}
