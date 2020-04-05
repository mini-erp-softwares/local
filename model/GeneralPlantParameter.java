package com.ent.mini.erp.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GeneralPlantParameter implements Serializable {

	Boolean negStockInPlant;
	String serialNoProfile;
	String profitCenter;
	String serlLevel;
	String logHandlingGroup;
	String distProfile;
	String stockDetermGroup;

}
