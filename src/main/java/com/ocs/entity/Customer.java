package com.ocs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Goodarzi on 10/12/14.
 */
@Entity
@Table(name="smpl.CUSTOMER")
public class Customer implements DomainObject {

    private int id;
    private String name;
    private String surname;

    /**
     * Get Customer Id
     *
     * @return int - Customer Id
     */
    @Id
    @Column(name="ID", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    /**
     * Set Customer Id
     *
     * @param id int - Customer Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get Customer Name
     *
     * @return String - Customer Name
     */
    @Column(name="NAME", unique = true, nullable = false)
    public String getName() {
        return name;
    }

    /**
     * Set Customer Name
     *
     * @param name String - Customer Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Customer Surname
     *
     * @return String - Customer Surname
     */
    @Column(name="SURNAME", unique = true, nullable = false)
    public String getSurname() {
        return surname;
    }

    /**
     * Set Customer Surname
     *
     * @param surname String - Customer Surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("id : ").append(getId());
        strBuff.append(", name : ").append(getName());
        strBuff.append(", surname : ").append(getSurname());
        return strBuff.toString();
    }
}
