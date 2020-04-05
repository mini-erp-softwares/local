package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MaterialAuthorisationGroup implements Serializable {

	String dimensionEANs;
	int grossWeight;
	int netWeight;
	int volume;
	int sizeDimensions;
	String EAN_UPC;
	String weightUnit;
	String volumeUnit;
	String EANCategory;
}
