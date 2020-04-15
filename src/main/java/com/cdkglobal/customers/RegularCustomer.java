package com.cdkglobal.customers;

import java.util.List;

class RegularCustomer extends Customer{

    RegularCustomer(List<Slab> slabs) {
        //lowerBound is exclusive, upperBound is inclusive
        super(slabs);
    }
}
