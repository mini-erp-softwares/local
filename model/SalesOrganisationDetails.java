package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 

public class SalesOrganisationDetails implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SalesOrganisation salesOrganisation;											
	String deliveringPlant;
	String minimumOrderQuantity;
	String minimumDeliveryQuantity;		
	String countryCode;
	TaxCategory taxDetails;
}
