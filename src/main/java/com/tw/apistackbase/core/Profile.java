package com.tw.apistackbase.core;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Table(name = "profile")
@DynamicInsert(true)
public class Profile {
    @Id
    private String certId;
    @Column(name = "registeredCapital")
    private int registeredCapital;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "profile")
//    private Company company;

//    public Company getCompany() {
//        return company;
//    }

    public Profile() {
    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public int getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(int registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Profile(int registeredCapital, String certId){
        this.registeredCapital = registeredCapital;
        this.certId = certId;
    }
}
