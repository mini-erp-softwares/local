package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Preferences implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String preferenceStatus;
	String vendorDeclStatus;

}
