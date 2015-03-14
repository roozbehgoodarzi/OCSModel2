package com.ocs.entity;

import javax.persistence.*;

/**
 * Created by Goodarzi on 10/12/14.
 */
@Entity
@Table(name = "smpl.CUSTOMER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Customer extends AbstractEntity {
    String
            nationalId,
            firstName,
            lastName,
            fatherName,
            birthDate,
            identityCardSeri,
            identityCardSerial,
            identityCardNumber,
            createPlaceCode,
            createDate,
            bourseCode,
            personId,
            growDate,
            homePhone,
            mobilePhone1,
            faxNumber1,
            workPhone,
            mobilePhone2,
            faxNumber2,
            homeAddress,
            homePostalCode,
            workAddress,
            workPostalCode,
            email,
            birthPlace,
            createPlace,
            education,
            job;

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIdentityCardSeri() {
        return identityCardSeri;
    }

    public void setIdentityCardSeri(String identityCardSeri) {
        this.identityCardSeri = identityCardSeri;
    }

    public String getIdentityCardSerial() {
        return identityCardSerial;
    }

    public void setIdentityCardSerial(String identityCardSerial) {
        this.identityCardSerial = identityCardSerial;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getCreatePlaceCode() {
        return createPlaceCode;
    }

    public void setCreatePlaceCode(String createPlaceCode) {
        this.createPlaceCode = createPlaceCode;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getBourseCode() {
        return bourseCode;
    }

    public void setBourseCode(String bourseCode) {
        this.bourseCode = bourseCode;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getGrowDate() {
        return growDate;
    }

    public void setGrowDate(String growDate) {
        this.growDate = growDate;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone1() {
        return mobilePhone1;
    }

    public void setMobilePhone1(String mobilePhone1) {
        this.mobilePhone1 = mobilePhone1;
    }

    public String getFaxNumber1() {
        return faxNumber1;
    }

    public void setFaxNumber1(String faxNumber1) {
        this.faxNumber1 = faxNumber1;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getMobilePhone2() {
        return mobilePhone2;
    }

    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }

    public String getFaxNumber2() {
        return faxNumber2;
    }

    public void setFaxNumber2(String faxNumber2) {
        this.faxNumber2 = faxNumber2;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getHomePostalCode() {
        return homePostalCode;
    }

    public void setHomePostalCode(String homePostalCode) {
        this.homePostalCode = homePostalCode;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getWorkPostalCode() {
        return workPostalCode;
    }

    public void setWorkPostalCode(String workPostalCode) {
        this.workPostalCode = workPostalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCreatePlace() {
        return createPlace;
    }

    public void setCreatePlace(String createPlace) {
        this.createPlace = createPlace;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
