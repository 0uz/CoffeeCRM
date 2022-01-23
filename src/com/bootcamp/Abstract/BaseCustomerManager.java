package com.bootcamp.Abstract;

import com.bootcamp.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" Saved to DB");
    }
}
