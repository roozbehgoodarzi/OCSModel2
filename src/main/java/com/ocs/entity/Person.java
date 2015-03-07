package com.ocs.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Created by Goodarzi on 02/25/2015.
 */
@Entity
@Table(name = "smpl.PERSON")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person extends AbstractEntity {
    String personId;
    String firstName;
    String lastName;
    String nationalId;
    String accountId;
    String limitPayChq;
    String limitPayDoc;
    String limitCashPay;
    String limitCashRcv;

    String limitLoan;
    String limitLC;
    String limitCashArz;
    String unitEmployCode;

    public Person() {
        super();
    }

    public Person(String personId, String firstName, String lastName, String nationalId, String accountId, String limitPayChq, String limitPayDoc, String limitCashPay, String limitCashRcv, String limitLoan, String limitLC, String limitCashArz, String unitEmployCode) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalId = nationalId;
        this.accountId = accountId;
        this.limitPayChq = limitPayChq;
        this.limitPayDoc = limitPayDoc;
        this.limitCashPay = limitCashPay;
        this.limitCashRcv = limitCashRcv;
        this.limitLoan = limitLoan;
        this.limitLC = limitLC;
        this.limitCashArz = limitCashArz;
        this.unitEmployCode = unitEmployCode;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getLimitPayChq() {
        return limitPayChq;
    }

    public void setLimitPayChq(String limitPayChq) {
        this.limitPayChq = limitPayChq;
    }

    public String getLimitPayDoc() {
        return limitPayDoc;
    }

    public void setLimitPayDoc(String limitPayDoc) {
        this.limitPayDoc = limitPayDoc;
    }

    public String getLimitCashPay() {
        return limitCashPay;
    }

    public void setLimitCashPay(String limitCashPay) {
        this.limitCashPay = limitCashPay;
    }

    public String getLimitCashRcv() {
        return limitCashRcv;
    }

    public void setLimitCashRcv(String limitCashRcv) {
        this.limitCashRcv = limitCashRcv;
    }

    public String getLimitLoan() {
        return limitLoan;
    }

    public void setLimitLoan(String limitLoan) {
        this.limitLoan = limitLoan;
    }

    public String getLimitLC() {
        return limitLC;
    }

    public void setLimitLC(String limitLC) {
        this.limitLC = limitLC;
    }

    public String getLimitCashArz() {
        return limitCashArz;
    }

    public void setLimitCashArz(String limitCashArz) {
        this.limitCashArz = limitCashArz;
    }

    public String getUnitEmployCode() {
        return unitEmployCode;
    }

    public void setUnitEmployCode(String unitEmployCode) {
        this.unitEmployCode = unitEmployCode;
    }
}
