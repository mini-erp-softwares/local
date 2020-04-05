package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Communication implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
		
	String mobileNumber;							
	String telephone;
	String telephoneExtenstion;			
	String faxExtenstion;			
	String email;							

}
