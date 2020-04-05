package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SalesUnit implements Serializable {

	String unitOfMeasureGrp;
	String XDistChaiStatus;
	String DChainSpecStatus;
	String deliveringPlant;
	Boolean cashDiscount;
	Boolean salesUnitNoVar;
	String validFrom;	
	int validTo;	
	int grossWeight;	
	int netWeight;

}
