package com.cdkglobal.customers;

import com.cdkglobal.exceptions.InvalidCustomerTypeException;

import java.util.Arrays;

public class CustomerFactory {

    public static Customer getCustomer(String type) throws InvalidCustomerTypeException {

        switch (type.toUpperCase()) {

            case CustomerTypes.REGULAR:
                return new RegularCustomer(Arrays.asList(
                        new Slab(0, 5000, 0),
                        new Slab(5000, 10000, 10),
                        new Slab(10000, Double.MAX_VALUE, 20)));

            case CustomerTypes.PREMIUM:
                return new PremiumCustomer(Arrays.asList(
                        new Slab(0, 4000, 10),
                        new Slab(4000, 8000, 15),
                        new Slab(8000, 12000, 20),
                        new Slab(12000, Double.MAX_VALUE, 30)));

            default:
                throw new InvalidCustomerTypeException("Invalid customer type: "+type);
        }
    }
}
