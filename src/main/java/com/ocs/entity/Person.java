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
    String PersonId;
    String FirstName;
    String LastName;
    String NationalId;
    String AccountId;
    String LimitPayChq;
    String LimitPayDoc;
    String LimitCashPay;
    String LimitCashRcv;
    String LimitLoan;
    String LimitLC;
    String LimitCashArz;
    String UnitEmployCode;

    public String getPersonId() {
        return PersonId;
    }

    public void setPersonId(String personId) {
        PersonId = personId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getNationalId() {
        return NationalId;
    }

    public void setNationalId(String nationalId) {
        NationalId = nationalId;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }

    public String getLimitPayChq() {
        return LimitPayChq;
    }

    public void setLimitPayChq(String limitPayChq) {
        LimitPayChq = limitPayChq;
    }

    public String getLimitPayDoc() {
        return LimitPayDoc;
    }

    public void setLimitPayDoc(String limitPayDoc) {
        LimitPayDoc = limitPayDoc;
    }

    public String getLimitCashPay() {
        return LimitCashPay;
    }

    public void setLimitCashPay(String limitCashPay) {
        LimitCashPay = limitCashPay;
    }

    public String getLimitCashRcv() {
        return LimitCashRcv;
    }

    public void setLimitCashRcv(String limitCashRcv) {
        LimitCashRcv = limitCashRcv;
    }

    public String getLimitLoan() {
        return LimitLoan;
    }

    public void setLimitLoan(String limitLoan) {
        LimitLoan = limitLoan;
    }

    public String getLimitLC() {
        return LimitLC;
    }

    public void setLimitLC(String limitLC) {
        LimitLC = limitLC;
    }

    public String getLimitCashArz() {
        return LimitCashArz;
    }

    public void setLimitCashArz(String limitCashArz) {
        LimitCashArz = limitCashArz;
    }

    public String getUnitEmployCode() {
        return UnitEmployCode;
    }

    public void setUnitEmployCode(String unitEmployCode) {
        UnitEmployCode = unitEmployCode;
    }
}
