/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.repository;

import com.bongani.klaas.cateringapp.domain.Customer;

/**
 *
 * @author bongani
 */
public interface CustomerRepository extends repository<Customer, Long>
{

    public void save(Customer cust);

    
}
