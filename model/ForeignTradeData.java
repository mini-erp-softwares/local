package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ForeignTradeData implements Serializable {

	int commOrImpCodeNo;
	String exportOrImportGroup;
	String CASNumber;
	int prodComNo;
	String controlCode;

}
