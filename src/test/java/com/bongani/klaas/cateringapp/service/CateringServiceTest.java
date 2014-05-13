/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.service;

import com.bongani.klaas.cateringapp.app.conf.ConnectionConfig;
import com.bongani.klaas.cateringapp.domain.Address;
import com.bongani.klaas.cateringapp.domain.Customer;
import com.bongani.klaas.cateringapp.domain.Employee;
import static com.bongani.klaas.cateringapp.repository.CustomerRepositoryTest.ctx;
import com.bongani.klaas.cateringapp.repository.EmployeeRepository;
import static com.bongani.klaas.cateringapp.repository.EmployeeRepositoryTest.ctx;
import com.bongani.klaas.cateringapp.services.FoodServices;
import com.bongani.klaas.cateringapp.services.OrderLineServices;
import com.bongani.klaas.cateringapp.services.OrderServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
       @Test
     public void createEmployee() {
         repo = ctx.getBean(EmployeeRepository.class);
         Employee c = new Employee.Builder("Bonga")
                 .EmployeeAddress(new Address("Anele","Bellville","7500"))
                 .build();
         repo.save(c);
         id = c.getId();
         Assert.assertNotNull(c);
         
     
     }
     
     @Test(dependsOnMethods = "createEmployee")
     public void readEmployee(){
         repo = ctx.getBean(EmployeeRepository.class);
         Employee employee = repo.findOne(id);
         Address address = employee.getEmployeeAddress();
         Assert.assertEquals(address.getStreet(),"Anele");
         
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
