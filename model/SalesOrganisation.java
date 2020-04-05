package com.ent.mini.erp.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "SalesOrganisation")
public class SalesOrganisation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	String salesOrganisationId;
	String salesOrganisation;
	String salesOrganisationName;
	String companyCode;											
	String statisticsCurrency;
	String customerInterCompanyBilling;
	String salesOrgCalendar;			
	String Title;		
	
	Name name;
	Address address;
	Communication communication;
	List<Division> divisionList;
	
}
