/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bongani
 */
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int employeeId;
    private String name;
    private String address;
    private String tel;
    
   public Employee(Builder builder)
    {
        id = builder.id;
        employeeId = builder.employeeId;
        name = builder.name;
        address = builder.address;
        tel = builder.tel;
        
    }

    public Address getEmployeeAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Address getEmployeeAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Address getEmployeeAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class Builder{
    private Long id;
    private String name;
    private int employeeId;
    private String address;
    private String tel;

        public Builder(String bonganiklaasgmailcom) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

      public Builder id(Long value){
      this.id = value;
       return this;
        }
         public Builder name(String name) {
            this.name = name;
        return this;
        }
        
        public Builder employeeId(int value){
            this.employeeId = value;
            return this;
        }
        
           public Builder address(String value) {
            address = value;
            return this;
        }
        
         public Builder tel(String value) {
         tel = value;
         return this;
        }
        public Employee build(){
            return new Employee(this);
        }

        public Object EmployeeAddress(Address address) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Object EmployeeAddress(Address address) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Object EmployeeAddress(Address address) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.cateringapp.domain.Employee[ id=" + id + " ]";
    }
    
}
