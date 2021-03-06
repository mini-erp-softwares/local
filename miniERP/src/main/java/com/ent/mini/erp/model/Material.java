package com.ent.mini.erp.model;
import java.io.Serializable;

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
public class Material implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id                                                    
    private String materialId;
    private String materialName;
    private String materialDescription;
    private GeneralData generalData;
    private GroupTerms groupTerms; 
    private QuantityStipulations quantityStipulations;
    
    
}
