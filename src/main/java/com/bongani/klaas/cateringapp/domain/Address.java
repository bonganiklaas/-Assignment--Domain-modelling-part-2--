/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.domain;
import javax.persistence.Embeddable;

/**
 *
 * @author 204540461
 */
@Embeddable
public class Address {
    private String street;
    private String city;
    private String postalcode;

    public Address(String street, String city, String postalcode) {
        this.street = street;
        this.city = city;
        this.postalcode = postalcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalcode() {
        return postalcode;
    }
}
