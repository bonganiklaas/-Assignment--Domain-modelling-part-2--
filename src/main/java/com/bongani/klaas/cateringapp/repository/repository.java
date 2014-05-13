/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bongani.klaas.cateringapp.repository;
import java.util.List;

/**
 *
 * @author bongani
 */
interface repository<T, ID>
{
    public T find(ID id);
    public void persist(T entity);
    public void merge(T entity);
    public void remove(T entity);
    public List<T> findAll();
    public List<T> findInRange(int firstResult, int maxResults);
    public long count() ;
    public T getByPropertyName(String propertyName, String propertyValue);
    public List<T> getEntitiesByProperName(String propertyName, String propertyValue);
       
}


