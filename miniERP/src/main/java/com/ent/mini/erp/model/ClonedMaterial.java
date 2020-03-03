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
@Getter @Setter @NoArgsConstructor 
public class ClonedMaterial implements Serializable {


    private String materialName;

    private String materialDescription;
    
    
}
