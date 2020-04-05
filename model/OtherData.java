package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OtherData implements Serializable {

	String prodOrInspMemo;
	String pageFormat;
	String basicMaterial;
	String medium;
	String indStdDesc;

}
