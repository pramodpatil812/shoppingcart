package com.cdkglobal.customers;

import java.util.List;

class PremiumCustomer extends Customer{

    PremiumCustomer(List<Slab> slabs) {
        //lowerBound is exclusive, upperBound is inclusive
        super(slabs);
    }
}
