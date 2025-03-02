package com.pl.swift_codes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "swift_codes", schema = "public")
public class SwiftCode {

    @Id
    @Column(name = "swift_code")
    private String swiftCode;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String bankName;

    @Column(name = "country_iso2_code")
    private String countryISO2Code;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "code_type")
    private String codeType;

    @Column(name = "town_name")
    private String townName;

    @Column(name = "time_zone")
    private String timeZone;


    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCountryISO2Code() {
        return countryISO2Code;
    }


    public void setCountryISO2(String countryISO2) {
        this.countryISO2Code = countryISO2;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }


    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
