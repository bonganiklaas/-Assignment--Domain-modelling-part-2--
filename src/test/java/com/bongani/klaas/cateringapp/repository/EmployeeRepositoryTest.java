/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.repository;

import com.bongani.klaas.cateringapp.app.conf.ConnectionConfig;
import com.bongani.klaas.cateringapp.domain.Address;
import com.bongani.klaas.cateringapp.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bongani
 */
public class EmployeeRepositoryTest {
       public static ApplicationContext ctx;
    private Long id;

    private EmployeeRepository repo;
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createEmployee() {
         repo = ctx.getBean(EmployeeRepository.class);
         Employee c = new Employee.Builder("bongani")
                 .EmployeeAddress(new Address("Victoria","capetown","8000"))
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
         Assert.assertEquals(address.getStreet(),"Victoria");
         
     }
     
    @Test(dependsOnMethods = "readEmployee")
     private void updateEmployee(){
         repo = ctx.getBean(EmployeeRepository.class);
         Employee employee = repo.findOne(id);
         Employee updatedEmployee = new Employee.Builder("Bongani")
                 .EmployeeAddress(new Address("Rhodes", "Cape town", "8000"))
                 .build();
        
         repo.save(updatedEmployee);
         
         Employee newEmployee = repo.findOne(id);
         Address address = employee.getEmployeeAddress();
         Assert.assertEquals(address.getStreet(), "Rhodes");
         
     }
     
     @Test(dependsOnMethods = "updateEmployee")
     private void deleteEmployee(){
         repo = ctx.getBean(EmployeeRepository.class);
         Employee employee = repo.findOne(id);
         repo.delete(employee);
         
         Employee deletedEmployee = repo.findOne(id);
         
         Assert.assertNull(deletedEmployee);
         
         
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
