package com.ocs.entity;

import javax.persistence.*;

/**
 * Created by Goodarzi on 9/14/14.
 */
@MappedSuperclass
public abstract class AbstractEntity implements DomainObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
