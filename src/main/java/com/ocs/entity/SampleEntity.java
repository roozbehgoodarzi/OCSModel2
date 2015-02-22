package com.ocs.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Created by Goodarzi on 02/01/2015.
 */
@Entity
@Table(name = "smpl.SAMPLE_ENTITY")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SampleEntity extends AbstractEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
