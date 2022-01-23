package com.bootcamp;

import com.bootcamp.Abstract.BaseCustomerManager;
import com.bootcamp.Adapters.MernisServiceAdapter;
import com.bootcamp.Concreate.NeroCustomerManager;
import com.bootcamp.Concreate.StarbucksCustomerManager;
import com.bootcamp.Entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());

        Customer customer = new Customer(1,"Oguzhan","Duymaz", LocalDate.of(1999,6,28));
        customerManager.save(customer);
        customerManager2.save(customer);
    }
}
