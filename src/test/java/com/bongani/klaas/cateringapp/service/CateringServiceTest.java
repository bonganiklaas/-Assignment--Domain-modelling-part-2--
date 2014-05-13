/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.service;

import com.bongani.klaas.cateringapp.app.conf.ConnectionConfig;
import com.bongani.klaas.cateringapp.domain.Customer;
import com.bongani.klaas.cateringapp.domain.Employee;
import com.bongani.klaas.cateringapp.repository.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author bongani
 */
public class CateringServiceTest {
    public static ApplicationContext ctx; 
    private Long id;

    private EmployeeRepository repo;
    private Customer customer;
    private Employee employee;   
    
    public CateringServiceTest() 
    {
        
    }
      
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  
    @BeforeClass
    public static void setUpClass() throws Exception {
           ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
