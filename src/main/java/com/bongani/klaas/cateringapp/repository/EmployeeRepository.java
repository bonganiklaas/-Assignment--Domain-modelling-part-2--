/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.repository;

import com.bongani.klaas.cateringapp.domain.Employee;
import com.bongani.klaas.cateringapp.domain.Food;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author bongani
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{

}
