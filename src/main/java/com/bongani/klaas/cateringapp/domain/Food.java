/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author bongani
 */
@Entity
public class Food implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int foodId;
    private String name;
    private String foodType;
    private float price;
    
    private Food(Builder builder)
    {
        id = builder.id;
        foodId = builder.foodId;
        name = builder.name;
        foodType = builder.foodType;
        price = builder.price;
        
    }

    public Food() {
    }
        
    public static class Builder{
    private Long id;
    private String name;
    private float price;
    private String foodType;
    private int foodId;

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
        
        public Builder price(float value){
            this.price = value;
            return this;
        }
        
           public Builder foodType(String value) {
            foodType = value;
            return this;
        }
        
         public Builder foodId(int value) {
         foodId = value;
         return this;
        }
        public Food build(){
            return new Food(this);
        }
    
    }
    public Long getId() {
        return id;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getName() {
        return name;
    }

    public String getFoodType() {
        return foodType;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.cateringapp.domain.Food[ id=" + id + " ]";
    }
    
}
