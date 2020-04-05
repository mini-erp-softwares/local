package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class GroupingTerms implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	int matlStatisticsGroup;	
	String volumeRebatGroup;	
	String commisionGroup;	
	String pricingRefMatl;	
	String materialPricingGroup;	
	String productHierachy;	
	String acctAssignmentGroup;	
	String itemCategoryGroup;

}
