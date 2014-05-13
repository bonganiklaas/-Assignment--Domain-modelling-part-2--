/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.repository;

import com.bongani.klaas.cateringapp.app.conf.ConnectionConfig;
import com.bongani.klaas.cateringapp.domain.Address;
import com.bongani.klaas.cateringapp.domain.Customer;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
/**
 *
 * @author 204540461
 */
public class CustomerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;

    private CustomerRepository repo;

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createCustomer() {
         repo = ctx.getBean(CustomerRepository.class);
         Customer c = new Customer.Builder("bongani")
                 .CustomerAddress(new Address("Victoria","capetown","8000"))
                 .build();
         repo.save(c);
         id = c.getId();
         Assert.assertNotNull(c);
         
     
     }
     
     @Test(dependsOnMethods = "createCustomer")
     public void readCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repo.findOne(id);
         Address address = customer.getCustomerAddress();
         Assert.assertEquals(address.getStreet(),"Victoria");
         
     }
     
    @Test(dependsOnMethods = "readCustomer")
     private void updateCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repo.findOne(id);
         Customer updatedCustomer = new Customer.Builder("Bongani")
                 .CustomerAddress(new Address("Rhodes", "Cape town", "8000"))
                 .build();
        
         repo.save(updatedCustomer);
         
         Customer newCustomer = repo.findOne(id);
         Address address = customer.getCustomerAddress();
         Assert.assertEquals(address.getStreet(), "Rhodes");
         
     }
     
     @Test(dependsOnMethods = "updateCustomer")
     private void deleteCustomer(){
         repo = ctx.getBean(CustomerRepository.class);
         Customer customer = repo.findOne(id);
         repo.delete(customer);
         
         Customer deletedCustomer = repo.findOne(id);
         
         Assert.assertNull(deletedCustomer);
         
         
     }

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
