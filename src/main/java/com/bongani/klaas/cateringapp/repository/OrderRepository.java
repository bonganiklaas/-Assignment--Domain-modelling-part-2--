/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.repository;
import com.bongani.klaas.cateringapp.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author bongani
 */
public interface OrderRepository extends JpaRepository <Order, Long>
{

}
