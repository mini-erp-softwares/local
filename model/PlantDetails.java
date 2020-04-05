package com.ent.mini.erp.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class PlantDetails implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Plant plant;
	String availabilityCheck;							
	Boolean batchManagement;
	String serialNumberProfile;
	Boolean uniqueSERNumber;		
	String profitCenter;
	String countryOfOrigin;							
	String currency;
	String standardPrice;
	String priceUnit;		

}
