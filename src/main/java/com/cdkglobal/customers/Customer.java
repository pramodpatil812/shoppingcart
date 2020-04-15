package com.cdkglobal.customers;

import java.util.List;

public abstract class Customer {
    private List<Slab> slabs;

    Customer() {
    }

    Customer(List<Slab> slabs) {
        this.slabs = slabs;
    }

    public List<Slab> getSlabs() {
        return slabs;
    }

}
