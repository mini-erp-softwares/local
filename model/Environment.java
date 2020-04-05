package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	@Getter
	@Setter
	@NoArgsConstructor
	public class Environment implements Serializable {
	String DGIndicatorProfile;
	Boolean enviromentallyRlvt;
	Boolean inBulkOrLliquid;
	Boolean hightlyViscous;
}
