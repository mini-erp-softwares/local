package com.ent.mini.erp.model;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by mini erp 2020.
 */
@Document(collection = "Material")
@Getter @Setter @NoArgsConstructor 
public class MaterialMaster implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id                                                    
    private String materialMasterId;
    private String materialMasterCode;
    private String materialMasterDescription;
    private GeneralData generalData;
    private Dimension dimension;
    private List<SalesOrganisationDetails> salesOrganisationDetails;
    private List<PlantDetails> plantDetails;
    private String salesText;  
    
}
