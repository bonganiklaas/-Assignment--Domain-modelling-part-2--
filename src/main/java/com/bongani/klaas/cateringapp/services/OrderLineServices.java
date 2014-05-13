/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.services;

import com.bongani.klaas.cateringapp.domain.OrderLine;

/**
 *
 * @author bongani
 */
public interface OrderLineServices extends Customer <OrderLine,Long>
{

    public void save(OrderLine l);

    public OrderLineServices();

    public OrderLineServices();

    public OrderLineServices();

    public static class Builder {

        public Builder(String bonganiklaasgmailcom) {
        }
    }

    
}
