package com.ent.mini.erp.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class TemparatureCondition implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	String temparatureConditionId;
	String temparatureCondition;
	String temparatureConditionDesc;
	

}
