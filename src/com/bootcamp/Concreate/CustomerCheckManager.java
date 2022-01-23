package com.bootcamp.Concreate;

import com.bootcamp.Abstract.PersonCheckService;
import com.bootcamp.Entities.Customer;

public class CustomerCheckManager implements PersonCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
