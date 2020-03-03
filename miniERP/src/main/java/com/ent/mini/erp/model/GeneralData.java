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
	String basicUnitOfMeasure;
	int grossWeight;
	int netWeight;
	String availabilityCheck;	
	String replacementPart;	
	String qual_f_FreeGoodsDis;	
	String materialFreightGrp; 	
	Boolean batchManagement;
	String division;	
	String materialGroup;	
	String salesUnit;	
	String unitOfMeasureGroup;	
	String x_distChainStatus;	
	String d_Chain_SpecStatus;	
	String deliveringPlant;	
	String ValidFrom;	
	Boolean cashDiscount;	

}
