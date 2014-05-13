/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author bongani
 */
@Entity
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int OrderId;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date orderDate;
    private float Total;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    
    private Order(Builder builder) {
        id= builder.id;
        OrderId = builder.OrderId;
        orderDate = builder.orderDate;
        Total = builder.Total;
        customer = builder.customer;
        employee = builder.employee;
       }

    public static class Builder {

        private Long id;
        private int OrderId;
        private Date orderDate;
        private float Total;
        Customer customer;
        Employee employee;

        public Builder(String bonganiklaasgmailcom) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public Builder id(Long value) {
            id = value;
            return this;
        }

        public Builder OrderId(int OrderId) {
            this.OrderId = OrderId;
            return this;
        }

        public Builder orderDate(Date orderDate) {
            this.orderDate = orderDate;
            return this;
        }

        public Builder Total(float value) {
            this.Total = value;
            return this;
        }

        public Builder customer(Customer cust) {
            this.customer = cust;
            return this;
        }

        public Builder employee(Employee emp) {
            this.employee = emp;
            return this;
        }
        public Builder Order(Order order){
            id = order.getId();
            OrderId = order.getOrderId();
            orderDate = order.getDate();
            Total = order.getTotal();
            customer = order.getCustomer();
            employee = order.getEmployee();
           
            return this;
            
        }
        
        public Order build(){
            return new Order(this);
        }

    }

    public Long getId() {
        return id;
    }

    public int getOrderId() {
        return OrderId;
    }

    public Date getDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public float getTotal() {
        return Total;
    }

    public Employee getEmployee() {
        return employee;
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
        if (!(object instanceof Order)) {
            return false;
        }
        Order other = (Order) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.cput.cateringapp.domain.Order[ id=" + id + " ]";
    }
    
}
