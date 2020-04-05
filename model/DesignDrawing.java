package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class DesignDrawing implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String document;
	int pageNumber;
	String docChNo;
	String documentType;
	String pageFormat;
	String docVers;
	int noSheets;

}
