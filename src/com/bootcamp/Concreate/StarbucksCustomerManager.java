package com.bootcamp.Concreate;

import com.bootcamp.Abstract.BaseCustomerManager;
import com.bootcamp.Abstract.PersonCheckService;
import com.bootcamp.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private PersonCheckService service;

    public StarbucksCustomerManager(PersonCheckService service) {
        this.service = service;
    }

    @Override
    public void save(Customer customer) {
        if (service.CheckIfRealPerson(customer)){
            super.save(customer);
        }else{
            throw new RuntimeException("Not a valid person!");
        }
    }


}
