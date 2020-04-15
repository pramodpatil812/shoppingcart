package com.cdkglobal;

import com.cdkglobal.customers.Customer;
import com.cdkglobal.customers.Slab;

class Cart {
    private double purchasedAmount;
    private double billingAmount;
    private double discount;
    private Customer customer;

    Cart(double purchasedAmount, Customer customer) {
        this.purchasedAmount = purchasedAmount;
        this.customer = customer;
        this.discount = 0;
        this.billingAmount = 0;
    }

    double calculateBillingAmount() {
        for(Slab slab:customer.getSlabs()) {
            if(purchasedAmount > slab.getLowerBound() && purchasedAmount <= slab.getUpperBound()) {
                discount += (purchasedAmount-slab.getLowerBound())*slab.getDiscount()/100;
                break;
            }
            else {
                discount += (slab.getUpperBound()-slab.getLowerBound())*slab.getDiscount()/100;
            }
        }

        return billingAmount = purchasedAmount - discount;
    }

    double getBillingAmount() {
        return billingAmount;
    }

    double getDiscount() {
        return discount;
    }
}
