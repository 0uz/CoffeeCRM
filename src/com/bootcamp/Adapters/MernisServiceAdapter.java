package com.bootcamp.Adapters;

import com.bootcamp.Abstract.PersonCheckService;
import com.bootcamp.Entities.Customer;

public class MernisServiceAdapter implements PersonCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
